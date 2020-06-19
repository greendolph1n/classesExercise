package compositionHouse;

public class Desk {
	private Fan fan;
	private Lamp lamp;
	private BoseSpeaker speaker;
	private Nintendo nintendo;
	private Sick sick;
	
	public Desk(Fan fan, Lamp lamp, BoseSpeaker speaker, Nintendo nintendo, Sick sick) {
		super();
		this.fan = fan;
		this.lamp = lamp;
		this.speaker = speaker;
		this.nintendo = nintendo;
		this.sick = sick;
	}
	
	public Fan getFan() {
		return fan;
	}

	public BoseSpeaker getSpeaker() {
		return speaker;
	}

	public Nintendo getNintendo() {
		return nintendo;
	}

	public Sick getSick() {
		return sick;
	}

	public Lamp getLamp() {
		return this.lamp;
	}
	

	

}
