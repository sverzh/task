import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception
    {
        System.out.println("Введите пример");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] primer = reader.readLine().split(" ");
            Number num1 = new Number(primer[0]);
            Number num2 = new Number(primer[2]);
            Calculator calc = new Calculator(num1,num2,primer[1]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Введен не верный формат");
        }

    }
}
