
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author JeovaniQuintanilla
 */
public class Student extends Human {
        // ToDo 1: Make this class a child of Human
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code
    
    private int GPA;
    private int credits;

    public Student(String name, short age, int credits) {
        super(name, age);
    }
    
    /**
     * getter for credits field
     * @return 
     */
    public int getCredits() {
        return credits;
    }
    
    /**
     * sets the students number of credits
     * @param credits 
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }
    
  
    /**
     * getter for address field
     * @return address
     */
    @Override
    public String getAddress() {
        return address;
    }

    /**
     * sets the students address
     * @param address
     */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * getter for the GPA field
     * @return
     */
    public int getGPA() {
        return GPA;
    }

    /**
     * sets the students GPA
     * @param GPA
     */
    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

}