import java.util.Scanner;

public class PedirNumeros {
    public static void main(String[] args){
        
    
    var entrada = new Scanner(System.in);

    System.out.println("Por favor ingrese una palabra");
    var palabra = entrada.nextLine();
    System.out.println("Por favor ingrese otra palabra");
    var palabra1 = entrada.nextLine();
    System.out.println("Por favor ingrese ultima palabra");
    var palabra2 = entrada.nextLine();

    System.out.println(palabra+" "+palabra1+" "+palabra2);

    entrada.close();
}
}