package strategies.transportation;

public class CarStrategy implements TransportationStrategy {

    @Override
    public void move() {
        System.out.println("Vou de carro!");
    }
}