package com.example;

import com.example.entity.Book;
import com.example.entity.Person;


public class Test {
    public static void main(String[] args) {
        Person per = new Person("张三");
        Book book = new Book("《Java：从入门到转行》");

        //相互引用
        //把书给这个人&把所有者给书
        per.setBook(book);
        book.setPer(per);

        System.out.println("通过人找到书："+per.getBook().getName());
        System.out.println("通过书找到人："+book.getPer().getName());
    }
}
