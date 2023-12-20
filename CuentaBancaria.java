package poo;

import java.util.Scanner;

public class CuentaBancaria {
    Scanner entrada = new Scanner(System.in);
    
    private double cantidadInicial;
    private String titular;
    private double retirar;
    private double ingresar;
    private boolean ranflaquio;
    private boolean ranflaquio1;
    private boolean ranflaquio2;
    
    public void setCantidadInicial() {
        
        do{
        System.out.println("Introduce la cantidad inicial de dinero: ");
        cantidadInicial = entrada.nextDouble();
        if(cantidadInicial > 0){
        System.out.println("Tu cantidad actual es de: "+cantidadInicial);
        ranflaquio = true;
        }else{
            System.out.println("Ingresa una cantidad mayor a 0.");
        }
        }while(ranflaquio == false);
    }
    
            public void setIngresar(){
                do{
                System.out.println("Ingresa la cantidad de dinero que quieres igresar: ");
                ingresar = entrada.nextDouble();
                cantidadInicial += ingresar;
                if (ingresar > 0){
                System.out.println("Tu nueva cantidad de dinero es de: "+cantidadInicial);
                ranflaquio1 = true;
                }else{
                    System.out.println("Ingresa una cantidad mayor a 0.");
                }
                }while(ranflaquio1 == false);
            }
            
            public void setRetirar(){
                do{
                System.out.println("Ingresa la cantidad de dinero que deseas retirar: ");
                retirar = entrada.nextDouble();
                if(retirar < cantidadInicial){
                cantidadInicial -= retirar;
                if(retirar > 0 ){
                System.out.println("Tu nueva cantidad de dinero es de: "+cantidadInicial);
                ranflaquio2 = true;
                }else{
                    System.out.println("Ingresa una cantidad mayor a 0.");
                 }
                }else{
                    System.out.println("No tienes suficiente dinero en el banco");
                }
                }while(ranflaquio2 == false);
            }
           }