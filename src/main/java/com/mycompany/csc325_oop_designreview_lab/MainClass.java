/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
	
	public static void main(String[] args) {
                
                // ToDo 8: The senior class should have a minimum of 85 credits  
		
		Student std1 = new Freshman("James", 20, 12);// name, age, credits
                Student std2 = new Senior("John", 30, 90);
                Scanner user = new Scanner(System.in);
                double fGpa = user.nextDouble();
		double sGpa = user.nextDouble();
                
                std1.setGPA(fGpa);
                std2.setGPA(sGpa);
                
		System.out.println(std1);
                
                System.out.println(std2);
		
		// ToDo 12: add comments and explain your code
		
		// ToDo 13: submit using a pull request.
	}

}