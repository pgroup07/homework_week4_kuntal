package carpet_cost_calculator;

public class Carpet {
    //Instance variables
    private double cost;

    //constructor
    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    // get cost
    public double getCost() {
        return this.cost;
    }
}
