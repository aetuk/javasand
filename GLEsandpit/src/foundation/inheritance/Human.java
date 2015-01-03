package foundation.inheritance;

public class Human extends Mammal {

	// This demonstrates Polymorphism - 'eat' 
	// over-writes the behaviour of the parent class
	String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String eat()
	{
		return "fish and chips";
	}
}
