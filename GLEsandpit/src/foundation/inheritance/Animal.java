package foundation.inheritance;

// This is an example of abstraction with Java
public abstract class Animal {
	

	// This demonstrates encapulation - yearage is being hidden
	// It can only be accessed via the methods defined below
	
	private int yearage;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	public String eat()
	{
		return "food";
	}

	public String sleep()
	{
		return "sleep";
	}

	public int getYearage() {
		return yearage;
	}

	public void setYearage(int yearage) {
		this.yearage = yearage;
	}

}
