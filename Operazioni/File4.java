import java.util.Scanner;
public class Fila4 {

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
      
      Fila4 f4 = new Fila4();
      
      switch (scelta){
        case 1: f4.sommaDueNumeri(in); 
                break;
        case 2: f4.sottraiDueNumeri(in); 
                break;
        case 3: f4.moltiplicaDueNumeri(in); 
                break;
        case 4: f4.dividiDueNumeri(in); 
                break;
        case 5: f4.quadratoDiUnNumero(in); 
                break;
        case 6: f4.cuboDiUnNumero(in); 
                break;
        default: f4.stampaMessaggio("Funzionalità non prevista!");
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