package Thread;
class MyThread extends Thread{
	  String s=null;

	  MyThread(String s1){
	  s=s1;
	  start();
	  }
	  public void run(){
	  System.out.println(s);
	  }
	}

public class ThreadCreation {

	public static void main(String[] args) {
			   
			  MyThread m1=new MyThread("Thread will start.....");
	}

}
