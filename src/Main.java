import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by KPS on 7/23/2020.
 */
public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input your name: ");
        String name = R.readLine();
        System.out.println("Your name is: " + name);
    }
}
