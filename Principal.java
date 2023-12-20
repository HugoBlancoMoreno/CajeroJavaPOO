package poo;

import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        CuentaBancaria cb = new CuentaBancaria();
        
        cb.setCantidadInicial();
        
        System.out.println("Qué opción quieres elegir.");
        
        System.out.println
        ( "1. Ingresar dinero\n"
        + "2. Retirar dinero.\n"
        + "3. Salir.");
        
        int opcion = entrada.nextInt();
        
        switch (opcion){
            case 1: cb.setIngresar();
                    break;
            
            case 2: cb.setRetirar();
                    break;
                    
            default: System.out.println("Has salido del sistema.");
        }
    }
}