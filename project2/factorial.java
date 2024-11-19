/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author Maira
 */
public class factorial {
    int fact(int n) {
        int result;
        
        if (n == 1) 
            return 1;
        result = fact(n -1) * n;
        return result;
    }
}
