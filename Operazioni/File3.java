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
        case 1: f1.sommaDueNumeri(in); 
                break;
        case 2: f1.sottraiDueNumeri(in); 
                break;
        case 3: f1.moltiplicaDueNumeri(in); 
                break;
        case 4: f1.dividiDueNumeri(in); 
                break;
        case 5: f1.quadratoDiUnNumero(in); 
                break;
        case 6: f1.cuboDiUnNumero(in); 
                break;
        default: f1.stampaMessaggio("Funzionalità non prevista!");
      }
    }
    
    void stampaMessaggio(String m){
      System.out.println(m);
    }

    void sommaDueNumeri(Scanner in){
      //Inserire il codice qui
    }
    
    void sottraiDueNumeri(Scanner in){
      //Inserire il codice qui
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