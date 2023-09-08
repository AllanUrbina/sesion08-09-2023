import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
     Scanner lector=new Scanner(System.in);
     
      int numero = 0,numero1=0,numtotal=0;
      
      do{
      for(int x = 0; x<3; x++){ 
        
     
      System.out.println("Digite un numero entero");
    
      numero=lector.nextInt();
     
     System.out.println("Digite un numero1 entero");
    
     numero1=lector.nextInt();
      
     if(x==3){
        System.out.println("gasto sus intentos");
       }else{
        System.out.println("No se permite menores que 0");
      
     numtotal= numero+numero1;
    
      }
        }
       } while(numero>0&&numero1>0);
      
       if(numero>0&&numero1>0){
      
      
      System.out.println(+numero + numero1+ "+" + numtotal + "Suma de enteros positivos");
      
     }else{
       
       
     System.out.println("Intentos gastado ");
    
      }
       }
    
    
     
    
    
     
      
}

      
 





    

    

    


     
     
    


