import java.util.Scanner;

/**
 * Es3_thread_mureddu
 */
public class Es3_thread_mureddu {
    public static void main(String[] args) {
        //input da utente
        Scanner scan = new Scanner(System.in);  
        System.out.println("Iserisci valore n: ");

        int n = scan.nextInt();

        System.out.println("Inserisci valore k: ");

        int k = scan.nextInt();

        //istanzio thread
        Fattoriale primoFattoriale = new Fattoriale(n, "fattoriale_N");
        Fattoriale secondoFattoriale = new Fattoriale(k, "fattoriale_K");
        Fattoriale terzFattoriale = new Fattoriale((n-k), "fattoriale_N-K");
        
        
    
    }

    public static class Fattoriale extends Thread{
        private int val;

        public Fattoriale(int val, String nome){
            super(nome);
            this.val = val;
        }

        public int getVal(){
            return this.val;
        }

        @Override
        public void run() {
            
            for(int i=val-1; i>0; i--) {
                val *= i;
            }
        }
    }
    
}

