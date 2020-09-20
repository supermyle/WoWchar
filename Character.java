public abstract class Character
{
	protected String name;
	protected String race;
	protected String server;
	protected String spec;
	
	public void setName(String name)
	{
		this.name = name;
	}

	public void raceChange(String newRace)
	{
		System.out.println(name + " bought a race change from " + race + " to " + newRace + "\n");
		this.race = newRace;
	}

	public void setServer(String server)
	{
		this.server = server;
	}

	public void setSpec(String spec)
	{
		this.spec = spec;
	}

	public String toString()
	{
		return name + " - " + race;
	}
}
