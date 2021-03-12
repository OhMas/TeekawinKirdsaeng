import 'package:flutter/material.dart';
import 'package:movie_store/movie.dart';
import 'package:movie_store/movieModel.dart';
import 'package:scoped_model/scoped_model.dart';
import 'package:movie_store/cartpage.dart';

void main() => runApp(MyApp(
  model: movieModel(),
));

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  final movieModel model;
  const MyApp({Key key, @required this.model}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return ScopedModel<movieModel>(
      model: model,
      child: MaterialApp(
        debugShowCheckedModeBanner: false,
        title: 'Shopping Cart',
        home: ListScreen(),
        routes: {'/cart': (context) => CartPage()},
      ),
    );
  }
}

class ListScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.yellowAccent[50],
      appBar: AppBar(
        backgroundColor: Colors.red[100],
        title: Text('Movies'+'     Total: '+ ScopedModel.of<movieModel>(context,rebuildOnChange: true).totalCartValue.toString()+'฿' ),
        actions: <Widget>[
          FlatButton(
              child: Text("clear", style: TextStyle(color: Colors.white),),
              onPressed: () => ScopedModel.of<movieModel>(context).clearCart()),

          IconButton(
            icon: Icon(Icons.shopping_cart),
            onPressed: () => Navigator.pushNamed(context, '/cart'),
          )
        ],
      ),
      body: ListView.builder(
        itemExtent: 80,
        itemCount: itemList.length,
        itemBuilder: (context, index) {
          return ScopedModelDescendant<movieModel>(
              builder: (context, child, model) {
                return ListTile(
                    leading: Image.network(itemList[index].imageUrl),
                    title: Text(itemList[index].title),
                    subtitle: Text("\฿"+itemList[index].price.toString()),
                    trailing: OutlineButton(
                        child: Text("Add"),
                        onPressed: () => model.addProduct(itemList[index])));
              });
        },
      ),
    );
  }
}



