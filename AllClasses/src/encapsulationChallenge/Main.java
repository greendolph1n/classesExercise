package encapsulationChallenge;

public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer(101, 0, true);
		printer.print(100);
		System.out.println(printer.getTonerLevel());
	}
}
