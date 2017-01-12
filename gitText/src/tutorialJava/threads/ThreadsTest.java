package tutorialJava.threads;

public class ThreadsTest {

	public static void main(String[] args) {
		
		new Thread(()->{
			while(true){
				System.out.println("ejecutando hilo 0...");
			}
		}).start();
		
		/*HILO 1*/
		new Thread(new Runnable(){
			@Override
			public void run(){
				while(true){
					System.out.println("ejecutando hilo 1...");
				}
			}
		}
				).start();
		/*HILO 2*/
		new Thread(new Runnable(){
			@Override
			public void run(){
				while(true){
					System.out.println("ejecutando hilo 2....");
				}
			}
		}
				).start();

	}

}
