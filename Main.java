public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to WoW Character Creator\n");

		//Create DK
		DeathKnight yottabytes = new DeathKnight("Yottabytes", "Undead", "Bleeding-Hollow"); 				
		yottabytes.setSpec("Unholy");

		//Create Mage
		Mage perl = new Mage("Perl", "Human", "Tichondrius"); 				
		perl.setSpec("Fire");

		System.out.println(yottabytes);
		System.out.println(perl);

		System.out.println("************COMBAT LOG************");
		yottabytes.deathcoil();
		perl.frostbolt();
		yottabytes.deathcoil();
		perl.icelance();
		perl.fireblast();
		yottabytes.bloodboil();
		yottabytes.pestilence();
		perl.fireblast();
		yottabytes.bloodboil();
		System.out.println("************COMBAT LOG************\n");

		yottabytes.raceChange("Orc");	
		System.out.println(yottabytes);

		perl.raceChange("Night Elf");	
		System.out.println(perl);
	}
}
