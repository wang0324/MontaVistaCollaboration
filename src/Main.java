import javax.xml.crypto.Data;
import java.util.ArrayList;

/***
 * Runs the DataParser and makes the CSV
 * @author Kevin Wang
 */
public class Main {
    public static void main(String[] args) {
        //TODO: Marc please implement your own toString method
        String educationFile = DataParser.readFileAsString("Data/Education.csv");

        ArrayList<EducationData> educationData = EducationParser.parseEducation(educationFile);

        System.out.println(educationData.toString());

//        String houseFile = DataParser.readFileAsString("Data/Median House Prices.csv");
//
//        ArrayList <HouseData> houseData = HouseParser.parseHouseData(houseFile) ;
//
//        for (HouseData obj:houseData) {
//            System.out.println(obj.toString());
//        }
//
//        System.out.println("Done Parsing!");

    }
}
