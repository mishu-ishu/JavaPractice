/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author Maira
 */
public class outer {
    int x = 100;
    
    void test() {
        inner in = new inner();
        in.display();
    }
    
    class inner {
        void display() {
            System.out.println(x);
        }
    }
}
