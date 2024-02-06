package exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class temperatura {
    public static void main(String[] args) {

        double celsius, fahrenheit;
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.0");
        System.out.println("Conversão de temperatura");
        System.out.print("Digite a temperatura em fahrenheit");
        fahrenheit = teclado.nextDouble();
        celsius = (5 * (fahrenheit - 32)) / 9;

        System.out.println("Temperatura em Celsius: " + formatador.format(celsius) + "");

        teclado.close();
        

    }
}
    

