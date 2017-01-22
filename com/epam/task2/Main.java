package com.epam.task2;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Shop shop = new Shop();
        shop.fillShopItems("/home/anton/Anton/Test.txt");
        Person person1 = new Person("Anton","Kuzmin",2759690);
        Person person2 = new Person("Andrew","Kurachev",3332943);
        Person person3 = new Person("Aliksey","Stepanov",2759090);
        shop.requestHandler(person1,"football","ball",3);
        shop.requestHandler(person2,"basketball","ball",2);
        shop.requestHandler(person2,"football","ball",1);
        shop.requestHandler(person3,"football","boots",3);
        shop.printAvilable();
        System.out.println();
        shop.printTalltSheet();
    }
}
