package com.company;

public class Main {

    public static void main(String[] args) {
        //1
        Ball ball1 = new Ball("red", 11); //создаём объект класса
        ball1.setColor("blue"); //меняем его свойства
        ball1.setNumberOfStrips(3);
        System.out.println(ball1.toString());
        System.out.println("---------------------");

        Ball ball2 = new Ball("pink", 10);
        System.out.println(ball2.getColor()); //выводим только поле "цвет"
        System.out.println(ball2.getNumberOfStrips()); //выводим только поле "количество полос"
        System.out.println(ball2.toString()); //выводим полную информацию о втором мяче
        System.out.println("___________________________________");

        //2
        Book book1 = new Book("book1", "ffff", 305);
        System.out.println(book1.toString());

        Book book2 = new Book(); //используем второй конструктор, чтобы изменить свойства "вручную"
        book2.setName("book2");
        book2.setAuthor("fff");
        book2.setNumberOfPages(408);

        System.out.println("---------------------");
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getNumberOfPages());

    }
}
