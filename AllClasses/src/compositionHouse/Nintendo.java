package compositionHouse;

public class Nintendo {
	private boolean on;
	private String gameName;
	public Nintendo(boolean on, String gameName) {
		super();
		this.on = on;
		this.gameName = gameName;
	}
	public void turnOn() {
		if(on) {
		System.out.println("The Nintendo Switch turns on. You decide to play some online smash.\n Soon you drop out of elite smash and get lag switched by a PK Fire spamming ness.");
		}
		else {
			System.out.println("You stared at your Nintendo Switch but didn't turn it on");
		}
	}
}
