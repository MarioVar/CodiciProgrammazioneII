import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedOutputStream;


public class WriterThread extends Thread {
	private DataOutputStream dat;
	private String s;
	public WriterThread(String Name,PipedOutputStream ots) {
		super(Name);
		dat=new DataOutputStream(ots);
	}
	public void run(){
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Thread_"+currentThread().getName()+"Inserisci una stringa: ");
			s=buff.readLine();
			dat.writeUTF(s);
			if(isInterrupted()){
				System.out.println("Thread_"+currentThread().getName()+" ho rilevato l'interruzione generata dal main thread, ma non abbasso il flag");
			}
			if(interrupted()){
				System.out.println("Thread_"+currentThread().getName()+" ho rilevato l'interruzione generata dal main thread,  e abbasso il flag interrupt");

			}if(interrupted()){
				System.out.println("Thread_"+currentThread().getName()+" non dovrebbe essere stampato");

			}
			

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
