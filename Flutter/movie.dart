import 'package:flutter/material.dart';

class Movie{
  int id;
  String title;
  String imageUrl;
  double price;
  int qty;

  Movie(
      {
        @required this.id,
        @required this.title,
        @required this.imageUrl,
        @required this.price,
        @required this.qty});
}

List<Movie> itemList = [
  Movie(
      id: 1,
      title:'Black panther(2018)',
      imageUrl:'https://m.media-amazon.com/images/M/MV5BMTg1MTY2MjYzNV5BMl5BanBnXkFtZTgwMTc4NTMwNDI@._V1_.jpg',
      price: 500,
      qty: 1
  ),
  Movie(
      id: 2,
      title:'Avengers: Endgame(2019)',
      imageUrl:'https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_UY1200_CR90,0,630,1200_AL_.jpg',
      price: 500,
      qty: 1
  ),
  Movie(
      id: 3,
      title:'Mission: Impossible - Fallout (2018)',
      imageUrl:'https://images-na.ssl-images-amazon.com/images/I/814V1XJaoAL._SL1500_.jpg',
      price: 300,
      qty: 1
  ),
  Movie(
      id: 4,
      title:'Mad Max: Fury Road (2015)',
      imageUrl:'https://m.media-amazon.com/images/M/MV5BN2EwM2I5OWMtMGQyMi00Zjg1LWJkNTctZTdjYTA4OGUwZjMyXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg',
      price: 250,
      qty: 1
  ),
  Movie(
      id: 5,
      title:'Spider-Man: Into the Spider-Verse (2018)',
      imageUrl:'https://m.media-amazon.com/images/M/MV5BMjMwNDkxMTgzOF5BMl5BanBnXkFtZTgwNTkwNTQ3NjM@._V1_.jpg',
      price: 400,
      qty: 1
  ),
  Movie(
      id: 6,
      title:'Wonder Woman (2017)',
      imageUrl:'https://thaiphotos.net/download/Y2ovTTRhaDBOSGh6UW5GZ08wZm13UT09',
      price: 500,
      qty: 1
  ),
  Movie(
      id: 7,
      title:'Dunkirk (2017)',
      imageUrl:'https://m.media-amazon.com/images/M/MV5BN2YyZjQ0NTEtNzU5MS00NGZkLTg0MTEtYzJmMWY3MWRhZjM2XkEyXkFqcGdeQXVyMDA4NzMyOA@@._V1_.jpg',
      price: 399,
      qty: 1
  ),
  Movie(
      id: 8,
      title:'Coco (2017)',
      imageUrl:'https://f.ptcdn.info/953/054/000/p0afedvwz9ebWu9fU94-o.jpg',
      price: 200,
      qty: 1
  ),
  Movie(
      id: 9,
      title:'Thor: Ragnarok (2017)',
      imageUrl:'https://images-na.ssl-images-amazon.com/images/I/A1HBBNzBdxL._AC_SL1500_.jpg',
      price: 600,
      qty: 1
  ),
  Movie(
      id: 10,
      title:'Logan (2017)',
      imageUrl:'https://images-na.ssl-images-amazon.com/images/I/71HCwLMPJVL._AC_SL1024_.jpg',
      price: 300,
      qty: 1
  ),

];