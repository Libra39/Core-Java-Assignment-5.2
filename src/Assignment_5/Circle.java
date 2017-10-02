package Assignment_5;																		// Package Declared
public class Circle extends Figure{															// Class Circle declared and inherited the properties of Figure 
	float Radius;																	        // Float Variable Radius declared
	Circle(float radius)	{														        // constructor is declare
		this.Radius = radius;}														        // this keyword is used to distinguish between class and instance variables
	public void findArea() {																// Parent class abstract methods implemented
	System.out.println("Radius of the Circle       = " +Radius);							// This will print the argument in the next line
	System.out.println("Value of pi                = " +Figure.pi);							// This will print the argument in the next line													// Parent class abstract methods implemented
	System.out.println("Area of the Circle         = " +((Figure.pi * Radius *Radius)));}	// This will print the argument in the next line
	public void findPerimeter(){													        // Parent class abstract methods implemented
    System.out.println("Perimeter of the Circle    = "+(2 * Figure.pi * Radius)+"\n");}		// This will print the argument in the next line
}																							// Circle class closed

