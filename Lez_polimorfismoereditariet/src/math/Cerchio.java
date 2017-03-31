package math;

public class Cerchio extends Shape implements FigureInterface {
		private int r;
		final double PI=3.1415;
		
		//contenimento debole
		private point p;
		
		public Cerchio(point p1,int r){
			p=p1;
			this.r=r;
		}
		// Contenimento forte
		 
		  public Cerchio(int x,int y,int r){
			p=new point(x, y);
			this.r=r;
		}
	
		public void draw() {
			p.draw();
			System.out.println("[Cerchio]: raggio="+r+", circonferenza="+2*PI*r+"\n");
		}
		public void PrintMessage() {
			System.out.println(s);
			System.out.println("I'm a circle");
		}

}
