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
        
        String houseFile = DataParser.readFileAsString("Data/Median House Prices.csv");

        ArrayList <HouseData> houseData = HouseParser.parseHouseData(houseFile) ;

        String employFile = DataParser.readFileAsString("Data/Unemployment.csv");

        ArrayList <EmployData> employData = EmployParser.parseData(employFile) ;

        ArrayList<OutputData> output = new ArrayList<>();

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
    }
}
