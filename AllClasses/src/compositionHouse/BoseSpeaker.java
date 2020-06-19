package compositionHouse;

public class BoseSpeaker {

	private boolean chargedBattery;

	public BoseSpeaker(boolean chargedBattery) {
		super();
		this.chargedBattery = chargedBattery;
	}

	public void turnOn() {
		if (chargedBattery) {
			System.out.println("You turned on the speaker.Your awesome Bose Speaker plays some chill lofi.");
		} else {
			System.out.println("You wanted to listen to some chill lofi, but the speaker's battery was depleted.");
		}
	}
}
