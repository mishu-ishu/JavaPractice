/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

/**
 *
 * @author Maira
 */
public class continueExample {
    public static void main(String[] args) {
        outer: for(int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (j > i) {
                    System.out.println("");
                    continue outer;
                }
                System.out.print(" " + (i*j));
            }
        }
        System.out.println("");
    }
}
