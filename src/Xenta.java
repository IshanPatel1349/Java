
final class Obvious {   // class declared as final can`t be overriden 
	private final int id;    // field declared as final can`t be reinitialsed
	private final String name; // immutable once created can`t change it`s state.

	public Obvious(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Obvious [id=" + id + ", name=" + name + "]";
	}

}

public class Xenta {
	public static void mian(String args[]) {

		Obvious o = new Obvious(1, "Ishan");
System.out.println(o);
	}

}