package com.pluralsight;

public class StaticClassesApp {

    public static void main(String[] args) {
        System.out.println(NameFormatter.format("Mel", "Johnson")); // Johnson, Mel
        System.out.println(NameFormatter.format("Dr.", "Mel", "B", "Johnson", "PhD")); // Johnson, Dr. Mel B, PhD
        System.out.println(NameFormatter.format("Mel B Johnson, PhD")); // Johnson, Mel B, PhD
    }

}
