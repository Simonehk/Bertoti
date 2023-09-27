import calc.AdditionOperation;
import calc.DivisionOperation;
import calc.MultiplicationOperation;
import calc.SubtractionOperation;

public class Client {
    public static void main(String[] args) {
        Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AdditionOperation()));
		System.out.println(calc.getResult(new SubtractionOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));
    }
}
