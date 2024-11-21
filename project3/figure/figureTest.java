/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3.figure;

/**
 *
 * @author Maira
 */
public class figureTest {
    public static void main(String[] args) {
        figure f;
        rectangle r = new rectangle(3, 5);
        triangle t = new triangle(5, 8);
        
        f = r;
        System.out.println(f.area());
        
        f = t;
        System.out.println(f.area());
    }
}
