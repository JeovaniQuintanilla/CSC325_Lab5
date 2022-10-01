/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author JeovaniQuintanilla
 */
public class MainClass {
	
	public static void main(String[] args) {
                
                // ToDo 8: The senior class should have a minimum of 85 credits  
		
		Student std1 = new Freshman("James", 20, 12); //polymorphism using freshman with student
                Student std2 = new Senior("John", 30, 90); //polymorphism using senior with student
                Scanner user = new Scanner(System.in);//scanner to allow user to input GPA
                double fGpa = user.nextDouble();// GPA for freshmen
		double sGpa = user.nextDouble();//GPA for Senior
                
                std1.setGPA(fGpa);//sets freshmen GPA
                std2.setGPA(sGpa);//sets Senior Gpa
                
		System.out.println(std1.toString());//prints Freshman data
                System.out.println(std2.toString());//prints Senior data
	
		// ToDo 13: submit using a pull request.
	}

}