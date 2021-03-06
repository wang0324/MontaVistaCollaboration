/***
 * Holds all House Data
 * @author Kevin Wang
 */
public class HouseData {
    private String countyName;
    private int medianHousePrice;

    public HouseData(String countyName, int medianHousePrice) {
        this.countyName = countyName;
        this.medianHousePrice = medianHousePrice;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getMedianHousePrice() {
        return medianHousePrice;
    }

    public void setMedianHousePrice(int medianHousePrice) {
        this.medianHousePrice = medianHousePrice;
    }

    /**
     * Returns a String with the HouseData
     * @return A String with the county name and median house price
     */
    public String toString() {
        return (countyName + " " + medianHousePrice);
    }
}
