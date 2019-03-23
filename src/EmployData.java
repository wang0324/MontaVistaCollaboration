/***
 * Holds employment data
 * @author Ananya Chilakamarthi
 */
public class EmployData {
    private String county;
    private float unemploymentRate;

    public EmployData(String county, float unemploymentRate) {
        this.county = county;
        this.unemploymentRate = unemploymentRate;
    }
    public String getCounty(){
        return county;
    }

    public void setCounty( String county){
        this.county = county;
    }

    public float getUnemploymentRate(){
        return unemploymentRate;
    }
     public void setUnemploymentRate(int unemploymentRate){
        this.unemploymentRate = unemploymentRate;
     }

    public String toString() {
        return (county + " " + unemploymentRate);
    }
}



