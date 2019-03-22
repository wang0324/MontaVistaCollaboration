/***
 * Parses all house data
 * @author Kevin Wang
 */

import java.util.ArrayList;

public class HouseParser {

    /**
     * Parses the House Price Data
     * @param houseFile Median House Prices.csv in the format of a String
     * @return ArrayList of HouseData objects with all the parsed data
     */
    public static ArrayList<HouseData> parseHouseData(String houseFile) {
        ArrayList<HouseData> results = new ArrayList<>();

        String[] lines = houseFile.split("\n");

        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];
            line = cleanString(line);
            System.out.println(line);
            String[] components = line.split(",");

            if (components.length >= 2) {
                results.add(new HouseData(components[0], Integer.parseInt(components[1])));
            }
        }

        return results;
    }

    /**
     * Cleans String of extra quotes and commas
     * @param line
     * @return A String without the extra quotes and commas
     */
    private static String cleanString(String line) {
        int firstQuote = line.indexOf("\"");
        int secondQuote = line.indexOf("\"", firstQuote + 1);

        if (firstQuote != -1) {
            String diff = line.substring(firstQuote, secondQuote + 1);
            String copy = diff;
            copy = copy.replaceAll("\"", "");
            copy = copy.replaceAll(",", "");
            line = line.replaceFirst(diff, copy);
        }

        return line;
    }
}