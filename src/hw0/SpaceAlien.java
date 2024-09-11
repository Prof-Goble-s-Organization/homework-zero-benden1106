package hw0;

/**
 * A SpaceAlien object stores and manipulates information about a race of
 * space aliens from another planet.
 * 
 * @author William Goble
 * @author Dickinson College
 * @version January 2024
 */
public class SpaceAlien {
    // the name of the alien's home planet
    protected String homePlanet;

    // Distance of the home planet from earth, in light years
    protected double distanceFromEarth;

    public SpaceAlien(String homePlanet, double distanceFromEarth) {
        this.homePlanet = homePlanet;
        this.distanceFromEarth = distanceFromEarth;
    }

    public void doGreeting() {
        System.out.println("Greetings from planet " + homePlanet + ", "
                + distanceFromEarth + " light years away");
    }

    /*public static void main(String[] args) {
        SpaceAlien descolada = new SpaceAlien("Lusitania", 42);
        descolada.doGreeting();
    }*/
}