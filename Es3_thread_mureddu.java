import java.util.Scanner;

/**
 * Es3_thread_mureddu
 */
public class Es3_thread_mureddu {
    public static void main(String[] args) {
        //input da utente
        Scanner scan = new Scanner(System.in);  
        int n;
        int k;
        do{
            System.out.println("Iserisci valore n: ");

            n = scan.nextInt();
    
            System.out.println("Inserisci valore k: ");
    
            k = scan.nextInt();

            if ((n - k) < 1){
                System.out.println("errore nell'inserimento: la differenza n-k deve essere maggiore di 0");
            }
            
        }while((n - k) < 1);
        

        //istanzio thread
        Fattoriale primoFattoriale = new Fattoriale(n, "fattoriale_N");
        Fattoriale secondoFattoriale = new Fattoriale(k, "fattoriale_K");
        Fattoriale terzoFattoriale = new Fattoriale((n-k), "fattoriale_N-K");
        
        primoFattoriale.start();
        secondoFattoriale.start();
        terzoFattoriale.start();

        try {
            primoFattoriale.join();
        } catch (InterruptedException e) {
            System.out.println("errore nel thread: "+primoFattoriale.getName());
        }

        try {
            secondoFattoriale.join();
        } catch (InterruptedException e) {
            System.out.println("errore nel thread: "+secondoFattoriale.getName());
        }

        try {
            terzoFattoriale.join();
        } catch (InterruptedException e) {
            System.out.println("errore nel thread: "+terzoFattoriale.getName());
        }

        System.out.println("Risultato = "+ (primoFattoriale.getVal() / (secondoFattoriale.getVal() * terzoFattoriale.getVal())));
    
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

