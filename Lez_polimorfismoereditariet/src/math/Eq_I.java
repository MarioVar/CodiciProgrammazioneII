package math;

public class Eq_I {
	private int a;
	private int b;
	private double sol;
	public Eq_I(int primo,int secondo){
		this.a=(int)primo;
		this.b=(int)secondo;
	}
	public void stampaEquazione(){
		System.out.println(this.a+"(X) "+this.b);
	}
	public void stampaSoluzione(){
		System.out.println("Soluzione: "+sol);
	}
	public void calcolaSol(){
		try{
		sol=(double)(-this.b)/(this.a);
		stampaSoluzione();
		}
		catch(Exception e){//non entra perche hai messo double come soluzione
			System.out.println("Non è un' equazione valida...");
		}
	}
	

}
