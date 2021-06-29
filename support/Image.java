package support;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Image
{
    public static void show(String fileName) {
        String dir = System.getProperty("user.dir");
        dir += "\\images\\";
        fileName = dir + fileName;
        try {
            final Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e1) {
            System.out.println(fileName + " not found!");
        }
    }
}