class SampleThread extends Thread{
	
	public void run() {
		System.out.println("Thread is under Running...");
		for(int i= 1; i<=10; i++) {
			System.out.println("i = " + i);
		}
	}	
}

class testd {

	public static void main(String[] args) {
		SampleThread t1 = new SampleThread();
		System.out.println("Thread about to start...");
		t1.start();
	}
}
