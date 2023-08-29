import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int valor_1, valor_2, resultado;
        double cociente = 0, exponente;
        System.out.println("----------MENU-----------");
        System.out.println("\ta) SUMAR");
        System.out.println("\tb) RESTAR");
        System.out.println("\tc) MULTIPLICAR");
        System.out.println("\td) DIVIDIR");
        System.out.println("\te) POTENCIACION");
        System.out.println("\tf) RADICACION");
        System.out.println("\tg) SALIR");
        System.out.println("----------MENU-----------");

        char opcion = scanner.next().charAt(0);

        switch (opcion) {
            case 'a':
                System.out.println("----------SUMA-----------");
                System.out.println("Ingrese el primer valor: ");
                 valor_1 = scanner.nextInt();
                System.out.println("Ingrese el segundo valor: ");
                 valor_2 = scanner.nextInt();
                 resultado = valor_1 + valor_2;
                System.out.println("La suma de: " + valor_1 + " y " + valor_2 + " es: " + resultado);
                break;
            case 'b':
                System.out.println("----------RESTA-----------");
                System.out.println("Ingrese el primer valor: ");
                 valor_1 = scanner.nextInt();
                System.out.println("Ingrese el segundo valor: ");
                 valor_2 = scanner.nextInt();
                 resultado = valor_1-valor_2;
                System.out.println("La resta de: " + valor_1 + " y " + valor_2 + " es: " + resultado);
                break;
            case 'c':
                System.out.println("----------MULTIPLICACION-----------");
                System.out.println("Ingrese el primer valor: ");
                 valor_1 = scanner.nextInt();
                System.out.println("Ingrese el segundo valor: ");
                 valor_2 = scanner.nextInt();
                 resultado = valor_1*valor_2;
                System.out.println("La multiplicacion de: " + valor_1 + " y " + valor_2 + " es: " + resultado);
                break;
            case 'd':
                System.out.println("----------DIVIDIR-----------");
                System.out.println("Ingrese el numerador valor: ");
                 double numerador = scanner.nextInt();
                System.out.println("Ingrese el denominador valor: ");
                 double denominador = scanner.nextInt();
                 if (denominador == 0) {
                    System.out.println("Usted no puede hacer semejante barbaridad");
                 } else {
                    cociente = numerador/denominador;
                    System.out.println("La division de: " + numerador + " y " + denominador + " es: " + cociente);
                 }
                
                break;
            case 'e':
                System.out.println("----------POTENCIACION-----------");
                System.out.println("Ingrese la base a potenciar: ");
                 valor_1 = scanner.nextInt();
                System.out.println("Ingrese el exponente: ");
                 valor_2 = scanner.nextInt();
                 exponente = Math.pow(valor_1, valor_2);

                System.out.println("La potenciacion de: " + valor_1 + " y " + valor_2 + " es: " + exponente);
                break;
            case 'f':
                System.out.println("----------RADICACION-----------");
                System.out.println("Ingrese la base a radicar: ");
                 valor_1 = scanner.nextInt();
                 if (valor_1 < 0) {
                    System.out.println("No es posible radicar un negativo porque es un numero imaginario");
                 } else {
                    double radicacion = Math.sqrt(valor_1);
                    System.out.println("La radicacion de: " + valor_1 + " es: " + radicacion);
                 }
                 
                break;
            case 'g':
                System.out.println("Tenga buen dia");
                break;
        
            default:
            System.out.println("¡Oops, opcion incorrecta!");
                break;
        }

        System.out.println("Programa terminado");
        scanner.close();
    }
}
