package strategies.eat;

public class UnhealthyFoodStrategy implements EatStrategy {
    
    @Override
    public void eat() {
        System.out.println("Eu comi um bolo de chocolate");
    }
} 
    
