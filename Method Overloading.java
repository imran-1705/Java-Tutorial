package test;

class A {
	void meth(int a) {
		System.out.println(a);
	}
	void meth(int a,int b) {
		System.out.println(a+b);
	}
}

public class vikas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A a = new A();
			a.meth(10);
			a.meth(10,20);
	}

}
