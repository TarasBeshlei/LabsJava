package com.company;

public class Main {

    public static void main(String[] args) {

        Book potter = new Book();

        Book witcher = new Book("The Witcher", 30, 85,"Andrzej Sapkowski");

        Book king = new Book("11.22.63", 10,100, "solid", "Stephen King");

        potter.setBookname("Harry Potter");
        potter.setAmount(30);
        potter.setPrice(150);
        potter.setCovertype("solid");
        potter.setAuthor("J.K.Rowling");
        System.out.println(potter);
        System.out.println(witcher);
        System.out.println(king);
        Book.printStaticSum();
        potter.printSum();
        witcher.printSum();
        king.printSum();
        potter.resreValue("Shine ", 10, 200, "soft", "Stephen King");
        witcher.resreValue("Metro ", 5, 400, "solid", "Dmitry Gluhovsky");
        king.resreValue("It ", 60, 250, "soft", "Stephen King");
        System.out.println(potter);
        System.out.println(witcher);
        System.out.println(king);
        Book.printStaticSum();
        potter.printSum();
        witcher.printSum();
        king.printSum();






    }
}