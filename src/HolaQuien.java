import java.util.Scanner;

public class HolaQuien {
    public static void main(String[] args){
        var sac = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        var nombre = sac.nextLine();
        System.out.println("Hola " + nombre + "!");

    }
    
}
