package classesExercise;

class VipCustomer {
	
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	

	public VipCustomer(String name, double creditLimit, String emailAddress) {
		//super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	public VipCustomer() {
		//super();
		this("Default Name",50000.00,"default email");
	}



	public VipCustomer(String name, double creditLimit) {
		//super();
		this(name,creditLimit,"default email");
	}



	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public static void main(String[] args) {
		Point point=new Point(6,5);
		
		System.out.println(point.distance(0,0));

	}

}
