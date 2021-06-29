import characters.Characters;
import characters.Mage;
import characters.Knight;
import world.Story;
import java.util.Scanner;

public class GameTester
{
    static int chkInput(final int x, final int y) {
        final Scanner sc = new Scanner(System.in);
        int choice = -1;
    //Label_0013_Outer:
        while (true) {
            while (true) {
                try {
                    while (true) {
                        choice = sc.nextInt();
                        if (choice >= x && choice <= y) {
                            break;
                        }
                        System.out.println("Wrong Input!!\nTry Again");
                    }
                    return choice;
                }
                catch (Exception e) {
                    System.out.println("Wrong Input!!\nTry Again");
                    sc.nextLine();
                    //continue; Label_0013_Outer;
                }
                continue;
            }
        }
    }
    
    public static void main(final String[] args) {
        final Story stry = new Story();
        stry.welcome();
        final int n = chkInput(1, 2);
        Characters c = null;
        if (n == 1) {
            c = new Knight();
        }
        else {
            c = new Mage();
        }
    }
}