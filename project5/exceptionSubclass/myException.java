/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project5.exceptionSubclass;

/**
 *
 * @author Maira
 */
public class myException extends Exception{
    private int detail;
    
    myException(int a) {
        detail = a;
    }
    
    public String toString() {
        return "myException[" + detail + "]";
    }
}
