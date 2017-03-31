import Exception.ExceptionDivision;
import math.*;

public class main {

	public static void main(String[] args) {
	point p= new point(2,5);
	Cerchio c=new Cerchio(p, 3);
	ColoredPoint cp=new ColoredPoint(3, 6, "Red");
	Cerchio c1=new Cerchio(5, 2, 1);
	Shape s=p;
	/*
	p.draw();
	c.draw();
	cp.draw();
	c1.draw();
	*/
	//s.draw();
	/*
	 * p.PrintMessage();
	c1.PrintMessage();
	cp.PrintMessage();
	*/
	int parametro_a=0,parametro_b=10,parametro_c=51;
	Eq_II eq=new Eq_II(parametro_a, parametro_b, parametro_c);
	eq.stampaEquazione();
	eq.delta();
	eq.stampaDelta();
	eq.calcolaSoluzioni();
	

	}

}
