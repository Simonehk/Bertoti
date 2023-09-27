package student;

import strategies.eat.HealthFoodStrategy;
import strategies.transportation.BikeStrategy;

public class NoTechStudent implements Student  {

    @Override
    public void eat() {
        new HealthFoodStrategy().eat();
    }

    @Override
    public void move() {
        new BikeStrategy().move();
    }
    
}
