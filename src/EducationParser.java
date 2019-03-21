import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/***
 * Pareses all Education Data
 * @author Marc Corfmat
 */
public class EducationParser {
    private static final int START_INDEX_EDUCATION = 70;
    private static final int INDECES_PER_OBJECT_EDUCATION = 87;

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

    private static String[] splitData(String data) {
        for (int i = 0; i < data.length(); i++) {
            if (data.substring(i, i + 1).equals("\"")) {
                do {
                    i++;
                    if (data.substring(i, i + 1).equals(",")) {
                        data = data.substring(0, i) + data.substring(i + 1);
                    }
                    if (data.substring(i, i + 1).equals("%")) {
                        data = data.substring(0, i) + data.substring(i + 1);
                    }
                } while (!data.substring(i, i + 1).equals("\""));
                i++;
            }
            if (data.substring(i, i + 1).equals("%")) {
                data = data.substring(0, i) + data.substring(i + 1);
            }
            if (data.substring(i, i + 1).equals("\n")) {
                data = data.substring(0, i) + "," + data.substring(i + 1);
            }
        }

        for (int i = 0; i < data.length(); i++) {
            if (data.substring(i, i + 1).equals("\"")) {
                data = data.substring(0, i) + data.substring(i + 1);
            }
        }

        return data.split(",");
    }


    public static ArrayList<EducationData> parseEducation2016(String data) {
        ArrayList<EducationData> results = new ArrayList<>();

        String[] dataArr = splitData(data);

        for (int i = START_INDEX_EDUCATION; i < dataArr.length; i += INDECES_PER_OBJECT_EDUCATION) {
            String countyName = dataArr[i];
            double noHighSchool = Double.parseDouble(dataArr[i + 1]);
            double onlyHighSchool = Double.parseDouble(dataArr[i + 2]);
            double someCollege = Double.parseDouble(dataArr[i + 3]);
            double bachelorsOrMore = Double.parseDouble(dataArr[i + 4]);

            EducationData result = new EducationData(countyName, noHighSchool, onlyHighSchool, someCollege, bachelorsOrMore);


            results.add(result);
        }

        return results;

    }

}
