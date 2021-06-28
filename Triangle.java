// Computes Triangle

public class Triangle{
    
    private int first_side;
    private int second_side;
    private int third_side;
    private int height;

    public Triangle(){
	first_side = 0;
	second_side = 0;
	third_side = 0;
	height = 0;
    }

    public Triangle (int first_side, int second_side, int third_side, int height){
	this.first_side = first_side;
	this.second_side = second_side;
	this.third_side = third_side;
	this.height = height;
    }

    public int computePerimeter(){
	return first_side + second_side + third_side;
    }
    
    // Compute for Area
    public int computeArea(){
	return (third_side/2)*height;
    }
    
    public boolean isIscocelles(){
	boolean flag = false;

	if(first_side == second_side && second_side == third_side)
	    flag = true;

	return flag;
    }

    public static void main (String[] args){
	
	Triangle myTriangle = new Triangle(2, 4, 6, 8);

	System.out.println(String.format("Triangle perimeter: %d", myTriangle.computePerimeter())); 

	// Compute for Triangle area
	System.out.println(String.format("Triangle Area: %d", myTriangle.computeArea())); 

	if(myTriangle.isIscoscelles())
	    System.out.println("It has equal side");
	else
	    System.out.println("It has different side");
    }

}
