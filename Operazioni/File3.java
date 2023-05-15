import java.util.Scanner;
public class Fila3 {

    public static void main(String[] args) {
      int scelta = 0;
      System.out.println("Selezionare l'operazione da effettuare");
      System.out.println("1-somma tra due numeri");
      System.out.println("2-differenza tra due numeri");
      System.out.println("3-prodotto tra due numeri");
      System.out.println("4-divisione tra due numeri");
      System.out.println("5-quadrato di un numero");
      System.out.println("6-cubo di un numero");
      Scanner in = new Scanner(System.in);
      scelta = in.nextInt();
      
      Fila3 f3 = new Fila3();
      
      switch (scelta){
        case 1: f3.sommaDueNumeri(in); 
                break;
        case 2: f3.sottraiDueNumeri(in); 
                break;
        case 3: f3.moltiplicaDueNumeri(in); 
                break;
        case 4: f3.dividiDueNumeri(in); 
                break;
        case 5: f3.quadratoDiUnNumero(in); 
                break;
        case 6: f3.cuboDiUnNumero(in); 
                break;
        default: f3.stampaMessaggio("Funzionalità non prevista!");
      }
    }
    
    void stampaMessaggio(String m){
      System.out.println(m);
    }

    void sommaDueNumeri(Scanner in){
    

    }
    
    void sottraiDueNumeri(Scanner in){
     System.out.println("Dammi il primo numero");
     int a = in.nextInt();
    System.out.println("Dammi il secondo numero");
     int b = in.nextInt();
     int sottrazione = a-b;
System.out.println("La differenza vale: " + sottrazione);
    
    }
    
    void moltiplicaDueNumeri(Scanner in){
      //Inserire il codice qui
    }
    
    void dividiDueNumeri(Scanner in){
      //Inserire il codice qui
    }
    
    void quadratoDiUnNumero(Scanner in){
      //Inserire il codice qui
    }
    
    void cuboDiUnNumero(Scanner in){
      //Inserire il codice qui
    }

}