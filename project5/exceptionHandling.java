/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project5;

/**
 *
 * @author Maira
 */
public class exceptionHandling {
    static void procA() {
        try {
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("ProcA finally");
        }
    }
    
    static void procB() {
        try {
            System.out.println("Inside procB");
            return;
        }
        finally {
            System.out.println("ProcB finally");
        }
    }
    
    public static void main(String[] args) {
        try {
            procA();
        } catch(Exception e) {
            System.out.println("Exception caught");
        }
        procB();
    }
}
