import javax.swing.text.EditorKit;

/***
 * Holds education data
 * @author Marc Corfmat
 */
public class EducationData {
    private String countyName;
    private double percentNoHSDiploma;
    private double percentHSDiplomaOnly;
    private double percentCollegeOrAssociates;
    private double percentBachelorOrHigher;

    public EducationData(String countyName, double percentNoHSDiploma, double percentHSDiplomaOnly, double percentCollegeOrAssociates, double percentBachelorOrHigher) {
        this.countyName = countyName;
        this.percentNoHSDiploma = percentNoHSDiploma;
        this.percentHSDiplomaOnly = percentHSDiplomaOnly;
        this.percentCollegeOrAssociates = percentCollegeOrAssociates;
        this.percentBachelorOrHigher = percentBachelorOrHigher;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public double getPercentNoHSDiploma() {
        return percentNoHSDiploma;
    }

    public void setPercentNoHSDiploma(double percentNoHSDiploma) {
        this.percentNoHSDiploma = percentNoHSDiploma;
    }

    public double getPercentHSDiplomaOnly() {
        return percentHSDiplomaOnly;
    }

    public void setPercentHSDiplomaOnly(double percentHSDiplomaOnly) {
        this.percentHSDiplomaOnly = percentHSDiplomaOnly;
    }

    public double getPercentCollegeOrAssociates() {
        return percentCollegeOrAssociates;
    }

    public void setPercentCollegeOrAssociates(double percentCollegeOrAssociates) {
        this.percentCollegeOrAssociates = percentCollegeOrAssociates;
    }

    public double getPercentBachelorOrHigher() {
        return percentBachelorOrHigher;
    }

    public void setPercentBachelorOrHigher(double percentBachelorOrHigher) {
        this.percentBachelorOrHigher = percentBachelorOrHigher;
    }
}
