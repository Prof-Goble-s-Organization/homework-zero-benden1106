package hw0;

import java.util.Scanner;
public class Driver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SpaceAlien descolada = new SpaceAlien("Lusitania", 42);
        descolada.doGreeting();
        SpaceMonster ben = new SpaceMonster("Jupiter", 5, "Invisibility");
        ben.doGreeting();
        System.out.print("How many people are you? ");
        int numPeople = sc.nextInt();
        System.out.println(ben.doSlimeZap(numPeople));
        sc.close();
    }
}