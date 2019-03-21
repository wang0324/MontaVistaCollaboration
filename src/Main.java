import java.util.ArrayList;

/***
 * Runs the DataParser and makes the CSV
 * @author Kevin Wang
 */
public class Main {
    public static void main(String[] args) {
        String educationFile = EducationParser.readFileAsString("data/Education.csv");

        ArrayList<EducationData> educationData = EducationParser.parseEducation(educationFile);

        System.out.println(educationData.toString());
    }
}
