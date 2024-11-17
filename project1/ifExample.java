/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

/**
 *
 * @author Maira
 */
public class ifExample {
    public static void main(String[] args) {
        int month = 6;
        String season;
        
        if (month == 12 || month == 1 || month == 2)
            season = "Winter";
        else if (month == 3 || month == 4 || month ==5)
            season = "Spring";
        else if (month == 6 || month == 7 || month == 8) 
            season = "Summer";
        else if (month == 9 || month == 10 || month == 11)
            season = "Autumn";
        else 
            season = "Invalid month";
        
        System.out.println("April is in the " + season);
        
    }
}
