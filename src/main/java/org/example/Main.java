package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a text you want to encrypt");
        String text1 = in.nextLine();

        System.out.println("Enter a key");
        String key1 = in.nextLine();

        System.out.println(Methods.encrypt(text1, key1));

        System.out.println("Enter a text you want to decrypt");
        String text2 = in.nextLine();

        System.out.println("Enter a key");
        String key2 = in.nextLine();

        System.out.println(Methods.decrypt(text2, key2));
    }
}