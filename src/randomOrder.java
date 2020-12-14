
import java.util.Random;


public class randomOrder {
    
    public int[] ordenarandom() {
        
        int[] cartas = new int[40];
        int orderedCard = 0;
        
        while(orderedCard < 40){
            Random r = new Random();
            int na = r.nextInt(20) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 40; i++){
                if(cartas[i] == na){
                    nvr++;
                }
            }
            if(nvr < 2){
                cartas[orderedCard] = na;
                orderedCard++;
            }
        }
        return cartas;
    }
    
    public int[] orderInOrder(){
        int[] cartas = new int[40];
        int numCarta = 0;
        
        for(int i=0; i<40 ; i++){
            for(int j=0 ; j<2 ; j++){
                
            }
        }
        
        return cartas;
    }
    
}
