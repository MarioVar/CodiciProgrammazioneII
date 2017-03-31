import java.io.*;
import java.lang.*;
public class main {

	public static void main(String[] args) throws IOException {
		PipedInputStream pi=new PipedInputStream();
		PipedOutputStream po;
		po = new PipedOutputStream(pi);
		WriterThread t1=new WriterThread("Scrittore", po);
		ReaderThread t2=new ReaderThread("Lettore", pi);
		try {
		
			t1.start();
			t2.start();
			System.out.println("Thread_"+Thread.currentThread().getName());
			Thread.sleep(1000);
		}catch(InterruptedException i){
			i.printStackTrace();
		}
		System.out.println("Thread_"+Thread.currentThread().getName()+" main->interrupt");
		t1.interrupt();
	}
}
