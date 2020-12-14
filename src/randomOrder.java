
import java.util.Random;

public class randomOrder {

    public int[] ordenarandom() {

        int[] cartas = new int[40];
        int orderedCard = 0;

        while (orderedCard < 40) {
            Random r = new Random();
            int na = r.nextInt(20) + 1;
            int nvr = 0;

            for (int i = 0; i < 40; i++) {
                if (cartas[i] == na) {
                    nvr++;
                }
            }
            if (nvr < 2) {
                cartas[orderedCard] = na;
                orderedCard++;
            }
        }
        return cartas;
    }

    public int[] orderInOrder() {
        int[] cartas = new int[40];
        int numCarta = 1;
        int numCarta2 = 1;

        for (int i = 0; i < 20; i++) {
            cartas[i] = numCarta;
            numCarta++;
        }
        for (int j = 20; j < 40; j++) {
            cartas[j] = numCarta2;
            numCarta2++;
        }

        return cartas;
    }

}
