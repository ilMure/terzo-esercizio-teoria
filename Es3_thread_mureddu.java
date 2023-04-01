import java.util.Scanner;

/**
 * Es3_thread_mureddu
 */
public class Es3_thread_mureddu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Iserisci valore n: ");

        String n = scan.nextLine();

        System.out.println("Inserisci valore k: ");

        String k = scan.nextLine();

        
    }

    public static class Fattoriale extends Thread{
        private int val;

        public int getVal(){
            return this.val;
        }

        @Override
        public int run() {
            int fattoriale = val;
            for(int i=val-1; i>0; i--) {
                fattoriale *= i;
            }
            return fattoriale;
        }
    }
    
}

