import java.util.ArrayList;

/***
 * Runs the DataParser and makes the CSV
 * @author Kevin Wang
 */
public class Main {
    public static void main(String[] args) {
        //TODO: Marc please implement your own toString method
        String educationFile = DataParser.readFileAsString("Data/Education.csv");
        System.out.println("Parsing education");
        ArrayList<EducationData> educationData = EducationParser.parseEducation(educationFile);
        
        String houseFile = DataParser.readFileAsString("Data/Median House Prices.csv");

        System.out.println("Parsing House Data");
        ArrayList <HouseData> houseData = HouseParser.parseHouseData(houseFile) ;

        String employFile = DataParser.readFileAsString("Data/Unemployment.csv");
        System.out.println("Parsing Employ Data");
        ArrayList <EmployData> employData = EmployParser.parseData(employFile) ;

        System.out.println("Getting output");
        ArrayList<OutputData> output = DataParser.getOutputData(educationData, houseData, employData);

        for (OutputData obj: output) {
            System.out.println(obj.toString());
        }
    }
}
