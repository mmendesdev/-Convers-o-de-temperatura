package Java;
import java.text.DecimalFormat;
import java.util.Scanner;

public class temperatura {

    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.0");
        String nome = ("Digite seu nome");
        System.out.println("Conversão de temperatura");
        System.out.print("Digite a temperatura em fahrenheit");
        fahrenheit = teclado.nextDouble();
        celsius = (5 * (fahrenheit - 32)) / 9;

        System.out.println("Temperatura em Celsius: " + formatador.format(celsius));
        System.out.println(nome);

        teclado.close();

    }

}
    

