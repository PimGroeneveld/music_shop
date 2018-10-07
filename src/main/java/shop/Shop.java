package shop;

import behaviours.Sellable;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Sellable> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStockCount() {
        return stock.size();
    }

    public void add(Sellable sellable) {
        stock.add(sellable);
    }

    public void removeStockItem() {
        stock.remove(0);
    }

    public double getTotalProfit() {
        double totalProfit = 0;
        for (Sellable stockItem : this.stock){
            totalProfit += stockItem.getProfit();
        }
        return totalProfit;
    }
}
