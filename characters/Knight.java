package characters;

import support.Image;
import support.Time;

public class Knight extends Characters
{
    public Knight() {
        super(80, 50, 20, "Knight");
        System.out.println("\n\t\tYou chose Knight!!!!!!!\n");
        Time.sleep(1);
        Image.show("Knight.txt");
        System.out.println("\n");
        this.showStat();
    }
}