package Unit8;

public class CircleTest {
	public static void main(String[] args) {
		System.out.println("-------------------");
		Circle c1 = new Circle(0.001);
		Circle c2 = new Circle("black", -9.0);

		c1.display();
		c2.display();

		c1.setRadius(-1);
		c1.setColor("black");
		c1.display();
	}
}
