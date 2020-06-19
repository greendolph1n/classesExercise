package classesExercise;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getAge() {
		return this.age;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public void setLastName(String name) {
		this.lastName = name;
	}

	public void setAge(int number) {
		if (number < 0 || number > 100) {
			this.age = 0;
		} else {
			this.age = number;
		}
	}

	public boolean isTeen() {
		if (age > 12 && age < 20) {
			return true;
		}
		return false;
	}
	
	public String getFullName() {
		if (this.firstName.isEmpty()&&this.lastName.isEmpty()) {
			return "";
		}
		else if (this.firstName.isEmpty()) {
			return this.lastName;
		}
		else if (this.lastName.isEmpty()) {
			return this.firstName;
		}
		return this.firstName+" "+this.lastName;
	}
}
