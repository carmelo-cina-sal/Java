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
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        default: f3.stampaMessaggio("Funzionalità non prevista o ancora mancante.");
      }
    }
    
    void stampaMessaggio(String m){
      System.out.println(m);
    }

}