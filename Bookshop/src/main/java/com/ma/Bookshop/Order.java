package com.ma.Bookshop;

public class Order<Price> {
    private final int number;
    private final Book book;
    private final Price price;
    Object PrintUtils;

    public Order(int number, Book book, Price price) {
        this.number = number;
        this.book = book;
        this.price = price;
    }
    
    public void printOrder() {
        double totalPrice = book.getPrice();

            System.out.println("******************************************");
            System.out.println( "Ваш заказ № ");
            System.out.println( String.valueOf(number));
        System.out.println("\t" + book.getTitle() + "\t\t" + book.getPrice());

        System.out.println( "------------------------------------------");
        System.out.println("\t\t\t\tИтого: " + totalPrice);
        System.out.println( "******************************************");

    }
}

