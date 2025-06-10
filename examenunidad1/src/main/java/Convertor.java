import java.util.Scanner;
public class Convertor {

    public static boolean stopValue = false;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do{
            try{
                System.out.println("Bienvenido al convertor!");
                System.out.println("Por favor, seleccione la medida que desea convertir:");
                System.out.println("1. Kilometros a Millas");
                System.out.println("2. Litros a Galones");
                System.out.println("3. Gramos a Onzas");
                System.out.println("4. Centimetros a Pulgadas");
                System.out.println("5. Salir");
                int option = sc.nextInt();
                switch(option){
                    case 1:
                        System.out.println("Por favor, ingrese la cantidad de Kilometros a convertir:");
                        double km = sc.nextDouble();
                        double miles = km * 0.621371;
                        System.out.println(km + " Kilometros son " + miles + " Millas.");
                        break;
                    case 2:
                        System.out.println("Por favor, ingrese la cantidad de Litros a convertir:");
                        double liters = sc.nextDouble();
                        double gallons = liters * 0.264172;
                        System.out.println(liters + " Litros son " + gallons + " Galones.");
                        break;
                    case 3:
                        System.out.println("Por favor, ingrese la cantidad de Gramos a convertir:");
                        double grams = sc.nextDouble();
                        double ounces = grams * 0.03527396;
                        System.out.println(grams + " Gramos son " + ounces + " Onzas.");
                        break;
                    case 4:
                        System.out.println("Por favor, ingrese la cantidad de Centimetros a convertir:");
                        double centimeters = sc.nextDouble();
                        double inches = centimeters * 0.393701;
                        System.out.println(centimeters + " Centimetros son " + inches + " Pulgadas.");
                        break;
                    case 5:
                        System.out.println("Saliendo del convertor. ¡Gracias por usarlo!");
                        stopValue = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("El valor ingresado no es válido. Por favor, intente de nuevo.");
            }
        } while (!stopValue);

    }
}
