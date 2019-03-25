public class OutputData {
    private String countyName;
    private double unemploymentRate;
    private double percentNoHSDiploma;
    private double percentHSDiplomaOnly;
    private double percentCollegeOrAssociates;
    private double percentBachelorOrHigher;
    private int medianHousePrice;

    public OutputData(String countyName, double unemploymentRate, double percentNoHSDiploma, double percentHSDiplomaOnly, double percentCollegeOrAssociates, double percentBachelorOrHigher, int medianHousePrice) {
        this.countyName = countyName;
        this.unemploymentRate = unemploymentRate;
        this.percentNoHSDiploma = percentNoHSDiploma;
        this.percentHSDiplomaOnly = percentHSDiplomaOnly;
        this.percentCollegeOrAssociates = percentCollegeOrAssociates;
        this.percentBachelorOrHigher = percentBachelorOrHigher;
        this.medianHousePrice = medianHousePrice;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public double getUnemploymentRate() {
        return unemploymentRate;
    }

    public void setUnemploymentRate(double unemploymentRate) {
        this.unemploymentRate = unemploymentRate;
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

    public int getMedianHousePrice() {
        return medianHousePrice;
    }

    public void setMedianHousePrice(int medianHousePrice) {
        this.medianHousePrice = medianHousePrice;
    }

    /**
     * Returns a String with all data separated by commas
     * @return String with all data separated by commas
     */
    public String toString() {
        return (countyName + "," + unemploymentRate + "," +percentNoHSDiploma + "," + percentHSDiplomaOnly + "," + percentCollegeOrAssociates + "," + percentBachelorOrHigher + "," + medianHousePrice);
    }
}
