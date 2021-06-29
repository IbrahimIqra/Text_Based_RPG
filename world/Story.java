package world;

import support.Image;
import support.Time;

public class Story
{
    public Story() {
        System.out.println("\t\t\t   Welcome to a Typical text based Adventure Game!!!");
        Time.sleep(1);
        System.out.println("\t\t\tExpect nothing special and you won't be dissapointed :D");
        Time.sleep(1);
    }
    
    public void welcome() {
        System.out.println("\n\t\t\t\t\tWelcome to Nowhere\n\n");
        Time.sleep(4);
        System.out.println("\t\tLights are Dim... Your head hurts.. You hear a voice in the distance..\n");
        Time.sleep(3);
        System.out.println("\t\tA child's voice.... Wake up!!!\n");
        Time.sleep(3);
        System.out.println("\t\tWAKE UP Father!!!\n");
        Time.sleep(3);
        System.out.println("\t\tAll of a sudden you realise there's fire all around you...\n");
        Time.sleep(2);
        Image.show("Fire.txt");
        Time.sleep(1);
        System.out.println("\t\tyou can remember now.. you are a\n");
        System.out.println("\n\t\t1.Knight\n\t\t2.Mage\n\n\t\tChoose!!");
    }
}