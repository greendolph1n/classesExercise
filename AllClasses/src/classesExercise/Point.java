package classesExercise;

public class Point {
	private int x;
	private int y;

	public Point() {
		// super();
	}

	public Point(int x, int y) {
		// super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public double distance() {
		return (Math.sqrt(this.y*this.y+(this.x*this.x)));
	}
	public double distance(int x, int y) {
		return Math.sqrt(Math.pow(x-this.x, 2.0)+Math.pow(y-this.y, 2.0));
	}
	public double distance(Point secondPoint) {
		return Math.sqrt(Math.pow(secondPoint.getX()-this.x, 2.0)+Math.pow(secondPoint.getY()-this.y, 2.0));
	}

}
