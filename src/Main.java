import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numeroIf = 0;

        numeroIf = reader.nextInt();

        if(numeroIf > 0){
            System.out.println("positivo");
        } else if (numeroIf == 0) {
            System.out.println("El numero es igual a cero");

        } else {
            System.out.println("El numero es negativo");
        }


    }
}