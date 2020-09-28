class AO {

	public void getDeatils() {

		System.out.println("Inside A");
	}
}

class BO extends AO {

	public void getDeatils() {

		System.out.println("Inside B");
		super.getDeatils();
	}

}

public class Main04 {

	public static void main(String[] args) {

		new BO();

		AO a = new BO();
		a.getDeatils();

	}

}
