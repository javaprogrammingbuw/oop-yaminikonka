

public class Driver{
	public static void main(String[] args){
		// points for lines
			Point2D p1 = new Point2D(4,5);
			Point2D p2 = new Point2D(8,-1);
			Point2D p3 = new Point2D(1,-1);
			Point2D p4 = new Point2D(9,2);
			Point2D p5 = new Point2D(3,5);
			Point2D p6 = new Point2D(8,8);
        // lines for geomentry
			Line2D l1 = new Line2D(p1,p2);
			Line2D l2 = new Line2D(p3,p4);
			Line2D l3 = new Line2D(p5,p6);
			Line2D l4 = new Line2D(p1,p2);
			Line2D l5 = new Line2D(p2,p3);
			Line2D l6 = new Line2D(p3,p1);

		// line1 length
			System.out.println(l1.getLength());
		// line2 length
			System.out.println(l2.getLength());
		// Rectangle
			iForm rec = new Rectangle(l1,l2);
			System.out.println(rec.area());
			System.out.println(rec.circumference());
		// Triangle
			iForm tri = new Triangle(l2,l3,l4);
			System.out.println(tri.area());
			System.out.println(tri.circumference());
		// Rectangle
			Rectangle r = new Rectangle(l4,l5);
			System.out.println(r.area());
			System.out.println(r.circumference());
		// Triangle
			Triangle t = new Triangle(l4,l5,l6);
			System.out.println(t.area());
			System.out.println(t.circumference());

	}
}