package ex;

public class Main {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		c1.count = 1;
		System.out.println(c2.count);
	}
}
class Counter {
	public static int count = 0;
}
