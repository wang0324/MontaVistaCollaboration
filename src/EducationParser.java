import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/***
 * Pareses all Education Data
 * @author Marc Corfmat
 */
public class EducationParser {
    private static final int START_INDEX_EDUCATION = 2;
    private static final int INDECES_PER_OBJECT_EDUCATION = 43;

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


    public static ArrayList<EducationData> parseEducation(String data) {
        ArrayList<EducationData> results = new ArrayList<EducationData>();

        String[] dataArr = splitData(data);

        for (int i = START_INDEX_EDUCATION; i < dataArr.length; i += INDECES_PER_OBJECT_EDUCATION) {
            String countyName = dataArr[i];
            double noHighSchool = Double.parseDouble(dataArr[i + 37]);
            double onlyHighSchool = Double.parseDouble(dataArr[i + 38]);
            double someCollege = Double.parseDouble(dataArr[i + 39]);
            double bachelorsOrMore = Double.parseDouble(dataArr[i + 40]);

            EducationData result = new EducationData(countyName, noHighSchool, onlyHighSchool, someCollege, bachelorsOrMore);


            results.add(result);
        }

        return results;

    }

}
