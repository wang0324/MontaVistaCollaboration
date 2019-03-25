/***
 * Holds employment data
 * @author Ananya Chilakamarthi
 */
public class EmployData {
    private String county;
    private double unemploymentRate;

    public EmployData(String county, double unemploymentRate) {
        this.county = county;
        this.unemploymentRate = unemploymentRate;
    }
    public String getCounty(){
        return county;
    }

    public void setCounty( String county){
        this.county = county;
    }

    public double getUnemploymentRate(){
        return unemploymentRate;
    }
     public void setUnemploymentRate(int unemploymentRate){
        this.unemploymentRate = unemploymentRate;
     }

    public String toString() {
        return (county + " " + unemploymentRate);
    }
}



