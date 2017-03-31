package math;

public class point extends Shape implements FigureInterface {
	private int x=0;
	private int y=0;
	
	public point(int a, int b){
		x=a;
		y=b;
	}
	public void draw(){
		System.out.println("[Coordinate punto]: ("+ x +" ,"+ y +")\n");
		
	}
	public void PrintMessage() {
		System.out.println(s);
		System.out.println("I'm a point");
	}
}
