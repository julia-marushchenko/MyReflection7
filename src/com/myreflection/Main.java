/**
 *  Java program to demonstrate reflection.
 */

package com.myreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 *  Main class.
 */
public class Main {

    // Fields of the class Main.
    public int i;
    String str;
    private double j;

    // Constructor.
    public Main() {

        // Printing to the console.
        System.out.println("Hello 0.");

    }

    // Constructor.
    public Main(int i) {

        // Printing to the console.
        System.out.println("Hello 1.");

    }

    // Constructor.
    public Main(int i, int j) {

        // Printing to the console.
        System.out.println("Hello 2.");

    }

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an instance of a class Main.
        Main main = new Main();

        // Getting all non-protected fields of Main class.
        Field[] fields = main.getClass().getFields();

        // Printing the non-protected fields of class Main to console.
        for (Field element : fields) {
            System.out.println("The field is " + element.getName());
        }

        // Getting all fields of the class Main.
        Field[] allFields = main.getClass().getDeclaredFields();

        System.out.println("All fields include private, protected, and default: ");

        // Printing all the fields of class Main to console.
        for (Field element : allFields) {
            System.out.println("The field is " + element.getName());
        }
    }
}