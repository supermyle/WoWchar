public class DeathKnight extends Character implements DeathKnightSpells
{
	private String charClass = "Death Knight";

	//Constructor for Name, Race, Server
	public DeathKnight(String name, String race, String server)
	{
		this.name = name;
		this.race = race;
		this.server = server;
	}
	
	public String toString()
	{
		return super.toString() + " " + spec + " " + charClass + "\nServer : " + server + "\n";
	}

	public void deathcoil()
	{
		System.out.println(name + " casted deathcoil.");
	}

	public void bloodboil()
	{
		System.out.println(name + " casted bloodboil.");
	}

	public void pestilence()
	{
		System.out.println(name + " casted pestilence.");
	}
}
