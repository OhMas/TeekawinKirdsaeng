import 'package:scoped_model/scoped_model.dart';
import 'package:movie_store/movie.dart';

class movieModel extends Model {
  List<Movie> cart = [];
  double totalCartValue = 0;

  int get total => cart.length;

  void addProduct(item) {
    int index = cart.indexWhere((i) => i.id == item.id);
    print(index);
    if (index != -1)
      updateProduct(item, item.qty + 1);
    else {
      cart.add(item);
      calculateTotal();
      notifyListeners();
    }
  }

  void removeProduct(item) {
    int index = cart.indexWhere((i) => i.id == item.id);
    cart[index].qty = 1;
    cart.removeWhere((item) => item.id == item.id);
    calculateTotal();
    notifyListeners();
  }

  void updateProduct(item, qty) {
    int index = cart.indexWhere((i) => i.id == item.id);
    cart[index].qty = qty;
    if (cart[index].qty == 0)
      removeProduct(item);

    calculateTotal();
    notifyListeners();
  }

  void clearCart() {
    cart.forEach((f) => f.qty = 1);
    cart = [];
    totalCartValue=0;
    notifyListeners();
  }

  void calculateTotal() {
    totalCartValue = 0;
    cart.forEach((f) {
      totalCartValue += f.price * f.qty;
    });
  }
}

class Product {
  int id;
  String title;
  String imageUrl;
  double price;
  int qty;

  Product({this.id, this.title, this.price, this.qty, this.imageUrl});
}