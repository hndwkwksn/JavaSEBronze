package chapter8_14;

public class SubCrass extends SuperClass {
	private int a;
	private int b;
	
	public SubCrass(int a) {
		this.a = a;
	}
	
	public SubCrass(int a, int b) {
		this(a);
		this.b = b;
	}
	
	public static void main(String[] args) {
		SubCrass sub = new SubCrass(2, 3);
		System.out.println(sub.num + ":" + sub.a + ":" + sub.b);
	}

}
