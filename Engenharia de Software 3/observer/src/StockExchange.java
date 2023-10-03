import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements Subject {

    private float price = 100; //preco incial, qdo S(0)
    private Random random; //para gerar valores aleatorios
    private List<Observer> observers;

    public StockExchange() {
        random = new Random();
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyAllObserver() {
        for(Observer observer : observers)
            observer.update(price);
    }

    public void start() {
        while(true) {
            try {
                Thread.sleep(500); //0,5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //gera o proximo S(t+1) 
            price = price + 2 * random.nextFloat() - 1; //toda vez que o preco da acao se altera:
            notifyAllObserver(); //devo notificar todos os observadores
            System.out.println(price);
        }
    }

   
    
}
