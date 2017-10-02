package Assignment_5;																	// Package declared
public class Triangle extends Figure{													// Class Triangle declared and inherited the properties of Figure 
	double side1;																		// Double Variable Side1 declared
	double side2;																		// Double Variable Side2 declared
	Triangle(double height, double base,double side1,double side2){                     // Constructor created
		super.dim1=height;																// super keyword is used to distinguish between class and instance variables
	    super.dim2=base;																// super keyword is used to distinguish between class and instance variables
	    this.side1=side1;																// this keyword is used to distinguish between class and instance variables
	    this.side2=side2;}																// this keyword is used to distinguish between class and instance variables	
	public void findArea(){																// Parent class abstract methods implemented
	  System.out.println("Height of the Triangle     = " +dim1);						// This will print the argument in the next line
	  System.out.println("Side a of the Triangle     = " +side1);						// This will print the argument in the next line
	  System.out.println("Base b of the Triangle     = " +dim2);						// This will print the argument in the next line
	  System.out.println("Side c of the Triangle     = " +side2);						// This will print the argument in the next line
	  System.out.println("Area of the Triangle       = "+(dim1*dim2)/2);}				// This will print the argument in the next line	
	public void findPerimeter(){														// Parent class abstract methods implemented
		  System.out.println("Perimeter of the Triangle  = "+(dim2+side1+side2));}		// This will print the argument in the next line
}																						// Triangle class closed