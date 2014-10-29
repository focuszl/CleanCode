package learn.huanggang;


public class ObjectsRef {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.setB(b);
		b.setA(a);

	}

}
class A{
	private B b;  //object holds each other's reference; the memory isn't exhausted, because it's just reference rather endless recycle.
	private String strA;
	
	public A(){
		testFunction();
	}

	/**
	 * 
	 */
	private void testFunction() {
		this.strA = "A" ;
	}
	
	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}

class B{
	private A a;  //object holds each other's reference;
	private String strB;
	
	public B(){
		this.strB = "B";
	}
	
	public A getA() {		
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
	
}