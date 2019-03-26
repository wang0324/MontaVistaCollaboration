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
            double rate = 0;

            String eachLine = lines[i];
            eachLine = clean(eachLine);
            String[] tokenList = lines[i].split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)",-1);
            //System.out.println(tokenList.length);
            if(tokenList[45]!= null && !tokenList[45].trim().equals("")){
                rate = Double.parseDouble(tokenList[45]);
            }

            EmployData data =  new EmployData(tokenList[2], rate);

            finished.add(data);


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
                replacement = replacement.replaceAll(",", "").trim();

                line = line.replace(orig, replacement);
            }

        return line;
    }
}

