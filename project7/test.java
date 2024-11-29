/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project7;

/**
 *
 * @author Maira
 */
public class test {
    public static void main(String[] args) {
        q q = new q();
        new producer(q);
        new consumer(q);
    }
}
