
public class Driver {

	public static void main(String[] args) {
		Rectangle Rect0 = new Rectangle(11, 5);
		Rectangle Rect1 = new Rectangle(5, 3);
		Rectangle Rect2 = new Rectangle(13, 8);
		
		Circle Circ0 = new Circle(11);
		Circle Circ1 = new Circle(13);
		Circle Circ2 = new Circle(67);
		
		Ellipse Ellip0 = new Ellipse(10, 22);
		Ellipse Ellip1 = new Ellipse(44, 21);
		Ellipse Ellip2 = new Ellipse(5, 2);
		
		System.out.println("RECTANGLE: \n" + "\t" + Rect0 + "\n" +
							"\t" + Rect1 + "\n" + 
							"\t" + Rect2 + "\n");
		System.out.println("CIRCLE: \n" + "\t" + Circ0 + "\n" +
							"\t" +Circ1 + "\n" + 
							"\t" +Circ2 + "\n");
		System.out.println("ELLIPSE: \n" + "\t" + Ellip0 + "\n" +
							"\t" + Ellip1 + "\n" + 
							"\t" + Ellip2 + "\n");
	}

}
