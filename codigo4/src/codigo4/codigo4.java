package codigo4;

import java.util.Scanner;

public class codigo4 {

	public static void main(String[] args)
	{

	Scanner scanner = new Scanner(System.in);
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = scanner.nextLine();
    scanner.close(); 
    
    
    
    Scanner scanner1 = new Scanner(System.in);
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    String j2 = scanner1.nextLine();
    scanner1.close(); 
    
    
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals( "tijeras")) {
            g = 1;
          }

        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
          }
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
      
    }
}
	
	}

