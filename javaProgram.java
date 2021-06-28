// Program for computing the Circle properties

import java.util.Math;

public class Test {
    
    private int radius;


    public Circle(){
	radius = 10;
    }

    public double computeCircumference(){
	return 2*Math.PI*radius;
    }

    public setRadius(int radius){
	this.radius = radius;
    }


    public static void main(String[] args){
	
	Test myTest = new Test();
	
	System.out.println("Circumference: " + myTest.computeCircumference());
    }
}
