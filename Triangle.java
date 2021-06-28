// Computes Triangle

public class Triangle{
    
    private int first_side;
    private int second_side;
    private int third_side;

    public Triangle(){
	first_side = 0;
	second_side = 0;
	third_side = 0;
    }

    public Triangle (int first_side, int second_side, int third_side){
	this.first_side = first_side;
	this.second_side = second_side;
	this.third_side = third_side;
    }

    public int computePerimeter(){
	return first_side + second_side + third_side;
    }
    

    public static void main (String[] args){
	
	Triangle myTriangle = new Triangle(2, 4, 6);

	System.out.println(String.format("Triangle perimeter: %d", myTriangle.computePerimeter())); 
    }

}
