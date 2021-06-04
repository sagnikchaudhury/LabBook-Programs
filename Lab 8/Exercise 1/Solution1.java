package lab8;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Solution1 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("source.txt");
        File output = new File("target.txt");

        FileInputStream fIn = new FileInputStream(input);
        FileOutputStream fOut = new FileOutputStream(output);
        ThreadClass1 th = new ThreadClass1(fIn, fOut);
        th.run();
    }
}