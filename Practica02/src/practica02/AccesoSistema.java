/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica02;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AccesoSistema {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        String correo, clave;
        int intentos=0;
        
      String regexCorreo = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern patron = Pattern.compile(regexCorreo);
        
  while (intentos < 5){
      
      System.out.print("Ingresa el Correo: ");
      correo= lector.nextLine();
      
      System.out.print("Ingrese la Clave: ");
      clave= lector.nextLine();
      
      Matcher matcher = patron.matcher(correo);
      
      if(matcher.matches()&&clave.equals("P@55w0rd")){
          System.out.println("Biendo al Sistema");
          break;
      }else{
          
          intentos ++;
          System.out.println("Acceso denago");
      }
  }
  
  if (intentos ==5){
      System.out.println("Cuenta Suspendida");
  }
  lector.close();
    }
    
}
