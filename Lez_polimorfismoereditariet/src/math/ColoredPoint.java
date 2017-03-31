package math;

public class ColoredPoint extends point implements FigureInterface{
	
	private String color="";
	public ColoredPoint(int x, int y, String color){
		super(x, y);
		this.color=color;
	}
	public void draw() {
		super.draw();
		System.out.println("[Colore punto]: "+ color+"\n");
	}
	
	public void PrintMessage(){
		super.PrintMessage();
		System.out.println("and i'm colored");
	}
	
}
