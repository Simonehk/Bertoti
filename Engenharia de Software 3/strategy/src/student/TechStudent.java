package student;

import strategies.eat.UnhealthyFoodStrategy;
import strategies.transportation.CarStrategy;

public class TechStudent implements Student {

    @Override
    public void eat() {
        new UnhealthyFoodStrategy().eat();
    }

    @Override
    public void move() {
        new CarStrategy().move();
    }

} 
