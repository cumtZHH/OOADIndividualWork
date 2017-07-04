package domain.model;

public abstract class Person {
	private String name;
	private String ssn;
	private String password;

	public Person(String name, String ssn,String password) {
		this.setName(name);
		this.setSsn(ssn);
		this.setPassword(password);
	}

        public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

		public Person() {
		this.setName("?");
		this.setSsn("???-??-????");
		this.setPassword("?");//SSN的形式
        }
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setSsn(String s) {
		ssn = s;
	}
	public String getSsn() {
		return ssn;
	}
	@Override
	public abstract String toString(); 

	public void display() {
		System.out.println("Person Information:");
		System.out.println("\tName:  " + this.getName());
		System.out.println("\tSoc. Security No.:  " + this.getSsn());
	}
}	
