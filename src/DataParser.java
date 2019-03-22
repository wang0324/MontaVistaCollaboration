import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/***
 * Parses all data
 * @author Kevin Wang
 */
public class DataParser {
    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }
}
