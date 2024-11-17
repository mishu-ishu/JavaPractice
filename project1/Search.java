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
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, num;
        boolean found = false;
        
        System.out.println("Enter size of array:");
        n = sc.nextInt();
        int nums[] = new int[n];
        
        System.out.println("Enter values of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.println("Enter number to search for:");
        num = sc.nextInt();
        
        for (int x : nums) {
            if (x == num){
                found = true;
                break;
            }
        }
        
        if (found)
            System.out.println("Value found");
        else
            System.out.println("Value not found");
    }
}
