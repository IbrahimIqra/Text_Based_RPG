package characters;

import support.Image;
import support.Time;

public class Mage extends Characters
{
    public Mage() {
        super(30, 40, 80, "Mage");
        System.out.println("\n\t\tYou chose Mage!!!!!!!!\n");
        Time.sleep(1);
        Image.show("Mage.txt");
        System.out.println("\n");
        this.showStat();
    }
}