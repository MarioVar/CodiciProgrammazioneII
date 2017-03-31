package Exception;
import java.lang.*;
public class ExceptionDivision extends Throwable{
	
	private static final long serialVersionUID = 0;
	public ExceptionDivision(){
		System.out.println("Eccezizone!");
	}

	public void messaggio0(){
		System.out.println("Non puoi dividere per zero");
		
	}
}
