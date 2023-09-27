package strategies.eat;

public class HealthFoodStrategy implements EatStrategy {

    @Override
    public void eat() {
        System.out.println("Eu comi arroz, feijão, salada e bife!");
    }
}