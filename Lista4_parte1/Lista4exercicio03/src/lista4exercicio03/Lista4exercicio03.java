package lista4exercicio03;
import java.util.*;
public class Lista4exercicio03 {

    public static void main(String[] args) {
        Random random = new Random();
        int vetor[];
        
        vetor = new int[50];
        for (int i = 0;i< vetor.length; i++){
            vetor[i] = random.nextInt();
            if(vetor[i] >= 0){
                System.out.println(vetor[i]);}
            
        }
        
        
    }
    
}
