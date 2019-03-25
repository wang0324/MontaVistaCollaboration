import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

    public static ArrayList<OutputData> getOutputData(ArrayList<EducationData> educationData, ArrayList<HouseData> houseData, ArrayList<EmployData> employData) {
        ArrayList <OutputData> output = new ArrayList<>();
        System.out.println("Started Getting output");
        for (EducationData eduData : educationData ){
            String name = eduData.getCountyName();
            double percentNoHS = eduData.getPercentNoHSDiploma();
            double percentHS = eduData.getPercentHSDiplomaOnly();
            double percentCollege = eduData.getPercentCollegeOrAssociates();
            double percentBachelor = eduData.getPercentBachelorOrHigher();
            int price = 0;
            double unemploy = 0.0;

            for (HouseData homes : houseData) {
                if (homes.getCountyName().equals(name)) {
                    price = homes.getMedianHousePrice();
                }
            }

            for (EmployData employ : employData){
                if (employ.getCounty().equals(name)) {
                    unemploy = employ.getUnemploymentRate();
                }
            }

            OutputData out = new OutputData(name, unemploy, percentNoHS, percentHS, percentCollege, percentBachelor, price);
            output.add(out);
        }
        return output;
    }
}
