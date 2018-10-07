package instruments;

import behaviours.Playable;
import behaviours.Sellable;

public class Octobass extends Instrument implements Playable, Sellable {

    public Octobass(String type, double priceBought, double priceSold) {
        super(type, priceBought, priceSold);
    }

    @Override
    public String play() {
        return "Bwammm";
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
