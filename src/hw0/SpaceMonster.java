package hw0;

public class SpaceMonster extends SpaceAlien implements ZapsWithSlime
{
    private String specialPower;

    public SpaceMonster(String homePlanet, int distanceFromEarth, String specialPower)
    {
        super(homePlanet, distanceFromEarth);
        this.specialPower = specialPower;
    }
    @Override public void doGreeting()
    {
        System.out.print("I am a monster from " + homePlanet + " with the special power of " + specialPower);
        System.out.println(". Prepare for suffering.");
    }
    public String doSlimeZap(int numHumans)
    {
        if (numHumans == 1)
        {
            return "zappppp";
        }
        else if (numHumans == 2)
        {
            return "Zappppp";
        }
        else
        {
            return "ZAPPPPP";
        }

    }
    public String slimeWholeEarth()
    {
        return "SHINEEEEE";
    }
}
