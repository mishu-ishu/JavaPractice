/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;
import java.util.Scanner;
/**
 *
 * @author Maira
 */
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        boolean isPrime;
        
        if (num == 2)
            isPrime = false;
        else 
            isPrime = true;
        
        for (int i = 2; i < num; i ++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
}
