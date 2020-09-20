public class Mage extends Character implements MageSpells
{
	private String charClass = "Mage";

	//Constructor for Name, Race, Server
	public Mage(String name, String race, String server)
	{
		this.name = name;
		this.race = race;
		this.server = server;
	}
	
	public String toString()
	{
		return super.toString() + " " + spec + " " + charClass + "\nServer : " + server + "\n";
	}
	
	public void frostbolt()
	{
		System.out.println(name + " casted frostbolt.");
	}

	public void icelance()
	{
		System.out.println(name + " casted icelance.");
	}

	public void fireblast()
	{
		System.out.println(name + " casted fireblast.");
	}
}
