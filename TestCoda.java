//Implementare qui la classe TestCoda, per l'esercizio del gioco della patata bollente
public class TestCoda {

    public static String patataBollente(String[] giocatori, int k) {
        Coda<String> coda = new Coda<>();

        for (int i = 0; i < giocatori.length; i++) {
            coda.enqueue(giocatori[i]);
        }

        System.out.println("Inizio gioco: " + coda);

        while (coda.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                String giocatore = coda.dequeue();
                coda.enqueue(giocatore);
            }

            String eliminato = coda.dequeue();
            System.out.println("Eliminato: " + eliminato + "  →  " + coda);
        }

        return coda.peek();
    }

    public static void main(String[] args) {
        String[] gruppo1 = {"Anna", "Bea", "Carlo", "Dario", "Elena"};
        String vincitore1 = patataBollente(gruppo1, 3);
        System.out.println("Vincitore: " + vincitore1);
        System.out.println();

        String[] gruppo2 = {"Marco", "Luigi", "Sofia", "Giulia"};
        String vincitore2 = patataBollente(gruppo2, 2);
        System.out.println("Vincitore: " + vincitore2);
        System.out.println();

        String[] gruppo3 = {"Solo"};
        String vincitore3 = patataBollente(gruppo3, 5);
        System.out.println("Vincitore: " + vincitore3);
    }
}