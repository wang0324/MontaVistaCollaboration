import java.util.ArrayList;

/***
 * Parses Employment Data
 * @author Ananya Chilakamarthi
 */
public class EmployParser {
    public static ArrayList<EmployData> parseData(String employFile) {
        ArrayList<EmployData> finished = new ArrayList<>();

        String[] lines = employFile.split("\n");

        for (int i = 8; i < lines.length; i++) {
            String eachLine = lines[i];
            eachLine = clean(eachLine);
            System.out.println(lines[i]);
           // String[] tokenList = lines[i].split(",");
            String[] tokenList = lines[i].split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

            float rate = 0;

            System.out.println(tokenList.length);
            if(tokenList[45] != ""){
                rate = Float.parseFloat(tokenList[45]);
            }

            finished.add(new EmployData(tokenList[2], rate));

        }

        return finished;
    }


    private static String clean(String line) {

            int q1 = line.indexOf("\"");
            int q2 = line.indexOf("\"", q1 + 1);
            if (q1 != -1) {
                String orig = line.substring(q1, q2 + 1);
                String replacement = orig;
                replacement = replacement.replaceAll("\"", "");
                replacement = replacement.replaceAll(",", "");
                line = line.replace(orig, replacement);
            }



        return line;
    }
}

