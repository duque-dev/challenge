import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Set vars
        String name = "Tony Stark";
        String accountType = "Corriente";
        double balance = 1599.99;
        int menuOption = 0;

        //Welcome!!
        System.out.println("******************************");
        System.out.println("Bienvenido a TrueBank");
        System.out.println("\nNombre del cliente: " + name);
        System.out.println("Tipo de cuenta: " + accountType);
        System.out.println("Saldo disponible: " + balance);
        System.out.println("\n******************************");

        //Menu
        String menu = """
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);

        while (menuOption != 9) {
            System.out.println(menu);
            menuOption = teclado.nextInt();


            switch (menuOption) {
                case 1:
                    System.out.println("El saldo actualizado es: " + balance + " $");
                    break;
                case 2:
                    System.out.println("Cuál es el valor que deseas retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > balance) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        balance = balance - valorARetirar;
                        System.out.println("Saldo restante: " + balance + " $");
                    }
                    break;
                case 3:
                    System.out.println("Cuál es el valor que vas a depositar?");
                    double valorADepositar = teclado.nextDouble();
                    balance += valorADepositar;
                    System.out.println("El saldo actualizado es: " + balance + " $");
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}