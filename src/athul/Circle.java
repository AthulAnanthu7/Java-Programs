package athul;

public class Circle {
public void cc(double r) {
	Square d1=new Square();
	double area= 3.14*(d1.sq(r));
	System.out.println("Area of circle= " + area);

}
public static void main(String args[]) {
	Circle d2= new Circle();
	d2.cc(5);
	
}
}
