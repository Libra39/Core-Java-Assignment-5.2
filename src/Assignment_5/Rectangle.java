package Assignment_5;																		  // Package Declared
public class Rectangle extends Figure {														  // Class Rectangle declared and inherited the properties of Figure 
	Rectangle(double length, double width){													  // constructor declared with 2 parameters
		super.dim1=length;																	  // Super keyword is used to distinguish between class and instance variables	
		super.dim2=width;}																	  // Super keyword is used to distinguish between class and instance variables	
	  public void findArea(){															      // Parent class abstract methods implemented	
		  System.out.println("Length of the Rectangle    = " +dim1);						  // This will print the argument in the next line
		  System.out.println("Width of the Rectangle     = " +dim2);						  // This will print the argument in the next line
		  System.out.println("Area of the Rectangle      = " +(dim1*dim2));}				  // This will print the argument in the next line
	  public void findPerimeter(){														      // Parent class abstract methods implemented
    	System.out.println("Perimeter of the Rectangle = " +(2 * (dim1 + dim2))+"\n");}		  // This will print the argument in the next line
}																							 // Rectangle class closed
