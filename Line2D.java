

public class Line2D{
	public Point2D point1;
	public Point2D point2;
	public Line2D(Point2D point1, Point2D point2){
		this.point1=point1;
		this.point2=point2;
	}
	public double getLength(){
		if((point1.x!=point2.x)&&(point1.y!=point2.x)){
            return Math.sqrt(Math.pow((point1.x-point2.x),2)+Math.pow((point1.y-point2.y),2));
		}else if(point1.x==point2.x){
            return Math.abs(point1.y-point2.y);
		}else{
			return Math.abs(point1.x-point2.x);
		}
		
	}
}