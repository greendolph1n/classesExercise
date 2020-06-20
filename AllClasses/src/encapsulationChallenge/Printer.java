package encapsulationChallenge;

public class Printer {
	private int tonerLevel = 100, printedPages = 0;
	private boolean isDuplex;

	public Printer(int tonerLevel, int printedPages, boolean isDuplex) {
		super();
		if (tonerLevel > -1 && tonerLevel < 100) {
			this.tonerLevel = tonerLevel;
		}
		if (printedPages == 0) {
			this.printedPages = printedPages;
		}
		this.isDuplex = isDuplex;
	}

	public void fillToner(int amount) {
		if (amount + tonerLevel > -1 && amount + tonerLevel < 100) {
			tonerLevel += amount;
			System.out.println(amount + " % Added, new toner level is now " + tonerLevel + " %");
		} else {
			System.out.println("Unable to add amount");
		}

	}

	public void print(int amount) {
		int amountToPrint = amount;
		if (isDuplex && tonerLevel - amount / 4 > 0) {
			amountToPrint = (int) Math.ceil(amount / 2.0);
		}
		if (amount > 0 && tonerLevel - amount / 4 > 0) {
			printedPages += amountToPrint;
			tonerLevel -= amount / 4;
			System.out.println("You have printed " + printedPages + " pages\nToner level:" + tonerLevel);
		} else {
			System.out.println("Cannot print. Toner may not have enough ink to print all.");
		}
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getPrintedPages() {
		return printedPages;
	}

}
