import java.lang.*;
import java.io.*;
public class ReaderThread  extends Thread{
	DataInputStream dat;
	public ReaderThread(String nome,PipedInputStream pip){
		super(nome);
		dat=new DataInputStream(pip);
	}
	public void run(){
		try{
			Thread.sleep(5000);
			System.out.print("\nThread_"+currentThread().getName()+"\nValore Estratto: "+dat.readUTF()+" \n");
			
		}catch(IOException e){
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
