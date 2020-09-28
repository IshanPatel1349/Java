
import java.util.HashSet;

final class _Connectionss {
	public final int A;
	public final int B;

	@Override
	public String toString() {
		return "_Connectionss [A=" + A + ", B=" + B + "]";
	}

	public _Connectionss(int a, int b) {
		super();
		A = a;
		B = b;
	}

	// some code omitted

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		_Connectionss that = (_Connectionss) o;

		return (A == that.A && B == that.B || A == that.B && B == that.A);
	}

	@Override
	public int hashCode() {
		return A ^ B;
	}

}
	class Abc{
    public static void main(String args []) {
    HashSet<_Connectionss> s = new HashSet<>();
    
    s.add(new _Connectionss(1, 3));
    s.add(new _Connectionss(2, 3));
    s.add(new _Connectionss(3, 2));
    s.add(new _Connectionss(1, 3));
    s.add(new _Connectionss(2, 1));

    s.remove(new _Connectionss(1, 2));

    for (_Connectionss x : s) {
        System.out.println(x);
    }

  }
}