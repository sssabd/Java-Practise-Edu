package com.company;

public class Main {

    public static void main(String[] args) {
	     Author author = new Author("Peter Parker", "PeterParker@gmail.com", 'm');
         System.out.println(author.getName());
         System.out.println(author.getEmail());
         System.out.println(author.getGender());

         author.setEmail("spiderman@gmail.com");
         System.out.println(author.toString());
    }
}
