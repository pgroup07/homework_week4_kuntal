package carpet_cost_calculator;

import carpet_cost_calculator.Carpet;
import carpet_cost_calculator.Floor;

public class Calculator {
    // Instance variables
    public Floor floor;
    public Carpet carpet;
    //Constructor
    public Calculator(Floor f,Carpet c){
        this.floor=f;
        this.carpet=c;
    }

    /**
     * This method get total cost
     * @return
     */
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
