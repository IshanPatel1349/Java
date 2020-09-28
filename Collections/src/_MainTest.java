class A {
	A() {
		System.out.println("Q");
	}
}

class B extends A {
	B() {

		System.out.println("B");
	}

}

public class _MainTest {

	public static void main(String args[]) {
		new B();
	}
}