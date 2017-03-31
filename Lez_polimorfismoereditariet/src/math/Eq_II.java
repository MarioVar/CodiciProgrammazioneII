package math;
import java.lang.Math;
import Exception.ExceptionDivision;
public class Eq_II {
	private int a;
	private int b;
	private int c;
	private int sol1,sol2;
	private int delta;
	
	public Eq_II(int primo,int secondo, int terzo){
		a=(int)primo;
		b=(int)secondo;
		c=(int)terzo;
	}
	public void stampaEquazione(){
		System.out.println(a+"(X^2) "+b+"(X) "+c);
	}
	public void stampaDelta(){
		System.out.println("Delta: "+delta);
	}
	
	public void delta(){
		delta=b*b-4*a*c;
	}
	public void stampaRisultati(){
		System.out.println("soluzione1="+sol1);
		System.out.println("Soluzione2="+sol2);
	}
	public void calcolaSoluzioni(){
		delta();
	try{
		if(delta>0){
			sol1=(int)(-b+Math.sqrt(delta))/(4*a);
			sol2=(int)(-b-Math.sqrt(delta))/(4*a);
			stampaRisultati();
		}else{
			System.out.println("L'equazione non ha radici reali");
		}
	} catch (ArithmeticException e) {
		Eq_I eqaz=new Eq_I(this.b, this.c);	
		System.out.println("L'equazione è del primo ordine, quindi ha una sola soluzione...");
		eqaz.calcolaSol();
	}
	catch (Exception e){
		System.out.println("Questa è un'eccezione generica");
	}
		
		
	}

}
