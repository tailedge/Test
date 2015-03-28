package jp.co.te.main;

public class Main {
	public static void main(String[] args) {
		try {
			new Main().execute();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void execute() {
		System.out.println("Hello, world.");
	}
}
