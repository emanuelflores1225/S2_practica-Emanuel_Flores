package s2_practica_emanuel_flores;
import java.util.Scanner;

public class S2_Practica_Emanuel_Flores {  
    public static void main(String[] args) {
        int opcion;
         do {
         Scanner leer = new Scanner(System.in);
         System.out.println("-----------------------");
         System.out.println("Bienvenido a practica 2");
         System.out.println("Ingrese la opcion deseada: ");
         System.out.println("1-> Cociente y residuo");
         System.out.println("2-> Multiplos");
         System.out.println("3-> IF, AND, OR");
         System.out.println("4-> BurnMath");
         System.out.println("5-> Suma de digitos");
         System.out.println("6-> Saliendo");
         /*int*/ opcion = leer.nextInt();
         System.out.println(+opcion);
         
        if (opcion == 1){
            int divis,divid,coc,res;
            System.out.println("Ingrese numero 1: ");
            divid = leer.nextInt();
            System.out.println("Ingrese numero 2: ");
            divis = leer.nextInt();
            coc=divid/divis;
            res=divid%divis;
            System.out.println("El cociente de " + divid + " sobre " + divis + " es: " + coc);
            System.out.println("El residuo de " + divid + " sobre " + divis + " es: " + res);
        }// fin opcion 1
        
        if (opcion == 2){ 
            int num;
            int mult; 
            System.out.print("Ingrese el numero deseado: ");
            num = leer.nextInt();
            System.out.println("Ingrese la cantidad de multiplos deseados: ");
            mult = leer.nextInt(); 
            for (int i = num; i <= (num*mult); i ++){ 
                System.out.print(i + ", ");
            }
        }//fin opcion 2
        
        if (opcion  == 3){
            int  numA;
            int numB;            
            System.out.println("Ingrese el primer numero: (solo 0 o 1)");
            numA = leer.nextInt();
            System.out.println("Ingrese el segundo numero: (solo 0 o 1)");
            numB = leer.nextInt();
            System.out.println(numA + ", " + numB);
            if ((numA == 0) || (numA == 1) && (numB == 0) || (numB == 1)){
                if ((numA == 0) && (numB == 0)){
                    System.out.println(" [0] [1] [0] [1]");
                } 
                else if ((numA == 0) && (numB == 1)){
                    System.out.println("[0] [1] [1] [0]");
                }
                else if((numA == 1) && (numB == 0)){
                    System.out.println("[0] [1] [1] [0]");
                }
                else if ((numA == 1) && (numB == 1)){
                    System.out.println("[1] [0] [1] [0]");
                }
            }
        }//fin opcion 3
        
        if (opcion == 4){
            double num, ans = 0, base;
            double cont = 1;
            System.out.println("Bienvenido a Sumatoria con Pow");
            System.out.println("Ingrese un numero: ");
            num = leer.nextDouble();

            while (cont <= num){
                base = cont/((2*cont)+1);
                ans = 2*(Math.pow(base, cont) + ans)*((num-1)/(num+1));
                cont++;
            }
            System.out.println("La sumatoria es: " + ans);
        }//fin opcion 4
        
        if (opcion == 5){
            int num, sum = 0;
            System.out.print("Ingrese un numero ");
            num = leer.nextInt();
            int aux=num;
            while (num != 0) {
                sum = sum + (num % 10);
                num = num / 10;
            }
            System.out.println("La suma de los digitos de " + aux + " es: " + sum);           
        }//fin opcion 5
       
        if (opcion == 6){
            System.out.println("Saliendo");
            }//fin opcion 6
        
        }while (6 != opcion);//fin do while
    } 
}//fin main

