package instruments;

public abstract class Instrument {

    private String type;
    private double priceBought;
    private double priceSold;

    public Instrument(String type, double priceBought, double priceSold) {
        this.type = type;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public String getType() {
        return type;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getPriceSold() {
        return priceSold;
    }

}
