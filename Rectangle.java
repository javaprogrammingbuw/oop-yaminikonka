

public class Rectangle implements iForm{
     private Line2D line1;
     private Line2D line2;
    public Rectangle(Line2D line1, Line2D line2){
    	this.line1 = line1;
    	this.line2 = line2;
    }
    public boolean isValid(){
    	// if((line1.point1.x>line2.point2.x)&&(line1.point1.y>line2.point2.y)&&(line1.point2.x>line2.point2.x)&&(line1.point2.y>line2.point2.y)){
                                                                                 // ____
    	// this is a one of the case of the rectangle with right angles, like this |____|
    	if((line1.point1==line2.point1)||(line1.point1==line2.point2)||(line1.point2==line2.point1)||(line1.point2==line2.point2)){
    		return true;
    	}else{
    		return false;
    	}
    }
    public double area(){
    	if(isValid()==true){
    		return line1.getLength()*line2.getLength();
    	}else{
    		return -1;
    	}
    }
    public double circumference(){
    	if(isValid()==true){
    		return 2*(line1.getLength()+line2.getLength());
    	}else{
    		return -1;
    	}
    }
}