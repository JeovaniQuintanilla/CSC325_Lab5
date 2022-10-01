
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author JeovaniQuintanilla
 */
public class MainClass {
	
	public static void main(String[] args) {
                
          
		
		Student std1 = new Freshman("James", 20, 12); //polymorphism using freshman with student
                Student std2 = new Senior("John", 30, 90); //polymorphism using senior with student
                Scanner user = new Scanner(System.in);//scanner to allow user to input GPA
                double fGpa = user.nextDouble();// GPA for freshmen
		double sGpa = user.nextDouble();//GPA for Senior
                
                std1.setGPA(fGpa);//sets freshmen GPA
                std2.setGPA(sGpa);//sets Senior Gpa
                
		System.out.println("\nFreshman Student:\n" + std1.toString());//prints Freshman data
                
                if(std2.getCredits() < 85){
                    System.out.println("Student doesn't reach credit amount to be recognized as a Senior");
                }else{
                    System.out.println("\nSenior Student:\n" + std2.toString());//prints Senior data
                }
              
	}

}