import java.util.Scanner;

/**
 * Es3_thread_mureddu
 */
public class Es3_thread_mureddu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Iserisci valore n: ");

        int n = scan.nextInt();

        System.out.println("Inserisci valore k: ");

        int k = scan.nextInt();

        
    }

    public static class Fattoriale extends Thread{
        private int val;

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

