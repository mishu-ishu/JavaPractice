/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project5;
import java.util.Random;

/**
 *
 * @author Maira
 */
public class tryCatchExample {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, count = 0;
        Random r = new Random();
        
        for (int i = 0; i < 30000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345/(b/c);
                count = count + 1;
            } 
            catch(ArithmeticException e) {
                System.out.println("Division by 0");
                a = 0;
            }
            System.out.println("a: " + a);
            System.out.println("Count: " + count);
        }
    }
}
