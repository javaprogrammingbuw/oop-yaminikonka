

public class Triangle implements iForm{
	private Line2D line1;
	private Line2D line2;
	private Line2D line3;
	public Triangle(Line2D line1, Line2D line2, Line2D line3){
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
	}
	public double getH(){
		if(isValid()==true){
			double alpha = Math.acos((-Math.pow(line1.getLength(),2)+Math.pow(line2.getLength(),2)+Math.pow(line3.getLength(),2))/2*line2.getLength()*line3.getLength());
			double beta = Math.acos((Math.pow(line1.getLength(),2)-Math.pow(line2.getLength(),2)+Math.pow(line3.getLength(),2))/2*line1.getLength()*line3.getLength());
			double gama = 180-alpha-beta;
			return Math.abs(line2.getLength()*Math.sin(gama));
		}else{
			return 0;
		}
	}
	public boolean isValid(){
		// if((line1.point1.x>line2.point2.x)&&(line1.point1.y>line2.point2.y)&&(line1.point2.x>line2.point2.x)&&(line1.point2.y>line2.point2.y)){
		if(line1.point1==line3.point2&&line1.point2==line2.point1&&line2.point2==line3.point1){	
			return true;
		}else{
			return false;
		}
	}
	public double area(){
		if(isValid()==true){
			return 0.5*line1.getLength()*getH();
		}else{
			return -1;
		}
	}
	public double circumference(){
		if(isValid()==true){
			return line1.getLength()+line2.getLength()+line3.getLength();
	    }else{
	    	return -1;
	    }
	}
}