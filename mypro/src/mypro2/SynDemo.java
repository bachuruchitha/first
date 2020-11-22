package mypro2;
class count{
	int co;
	public void incr() {
		co++;
	System.out.println("count of t1"+co);
	}
}
public class SynDemo {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		count c=new count();
		Thread t=new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<5;i++) {
					c.incr();
				}
			}
		});
		t.start();
		t.join();
		for(int i=0;i<5;i++) {
		System.out.println("count of main"+i);
		}

	}

}
