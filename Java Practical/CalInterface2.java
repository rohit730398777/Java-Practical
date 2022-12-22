
interface Printable{
	void display();
	
}
interface Calculate{
	int cal(int n);
}
class Square implements Printable,Calculate{
	public void display()
	{
		System.out.println("Calculate Square of a number is: ");
	}
	public int cal(int a) {
		return a*a;
	}
}
class Cube{
	public void display() {
		System.out.println("Calculate Cube of a number is:");
	}
	public int cal(int a) {
		return a*a*a;
	}
}
public class CalInterface2{
	public static void main(String args[]) {
		Square sq=new Square();
		sq.display();
		System.out.println(sq.cal(5));
		Cube cb=new Cube();
		cb.display();
		System.out.println(cb.cal(5));
	}
}
