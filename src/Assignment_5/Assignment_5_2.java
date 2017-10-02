package Assignment_5;																										// Package Declared
/** 
 * Create an abstract class Figure with following properties and functions: 
 * Properties: double dim1; 
 * Methods:         
 * abstract   void findArea(); 
 * abstract  void findPerimeter(); 
 * 
 * Create three subclasses Circle, Rectangle and Triangle that extends Figure class and define both the methods.  
 * Write  a  program  that  will  find the area  and perimeter of 3  Figures  and  print the details for all. 
 */
public class Assignment_5_2 {																								// Class Declared
	public static void main(String[] args) {																				// Main Method started
		System.out.println("\nThe Below Program will display the Area amd Perimeter of Rectangle, Circle and triangle.\n");	// This will print out the argument in the next line
		 Rectangle rectangle = new Rectangle(5,7);																			// new instance declared
         rectangle.findArea();																								// findArea() method called from Rectangle class
         rectangle.findPerimeter();																							// findPerimeter() method called from Rectangle class
         Circle circle = new Circle(10);																					// new instance declared
         circle.findArea();																									// findArea() method called from Circle class
         circle.findPerimeter();																							// findPerimeter() method called from Circle class
         Triangle triangle = new Triangle(5,5,5,5);																			// new instance declared
         triangle.findArea();																								// findArea() method called from Triangle class
         triangle.findPerimeter();																				    		// findPerimeter() method called from Triangle class																													// Main method closed
	}																														// Main method closed
}																															// Assignment_5_2 class closed