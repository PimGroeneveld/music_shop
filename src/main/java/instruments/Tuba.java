package instruments;

import behaviours.Playable;
import behaviours.Sellable;

public class Tuba extends Instrument implements Playable, Sellable {

    public Tuba(String type, double priceBought, double priceSold) {
        super(type, priceBought, priceSold);
    }

    @Override
    public String play() {
        return "Tuuut";
    }

    public double getMarkUp(){
        double increase = this.getPriceSold() - this.getPriceBought();
        return increase / this.getPriceBought() * 100;
    }

    public double setMarkUp(double percentage){
        return this.getPriceBought() * percentage;
    }

    public double getProfit(){
        return this.getPriceSold() - this.getPriceBought();
    }
}
