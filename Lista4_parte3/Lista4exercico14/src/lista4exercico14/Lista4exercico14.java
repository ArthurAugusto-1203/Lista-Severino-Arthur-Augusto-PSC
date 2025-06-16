package lista4exercico14;

import java.util.*;

public class Lista4exercico14 {
    public static void main(String[] args){
        
        Random random = new Random();
        float[] firstArray = new float[10], secondArray = new float[10], 
                multiplyArray = new float[10], divideArray = new float[10];
        float randomNumero;

        for (int i = 0; i<firstArray.length;  i++){
            randomNumero = random.nextFloat();
            firstArray[i] = randomNumero;
            randomNumero = random.nextFloat();
            secondArray[i] = randomNumero;
        }

        for (int i = 0; i<multiplyArray.length;  i++){            
            multiplyArray[i] = firstArray[i] * secondArray[i];
            divideArray[i] = firstArray[i] / secondArray[i];
        }

        System.out.print("Primeiro vetor --> | ");
        for (int i = 0; i < firstArray.length ; i++){
            System.out.print(firstArray[i] + " | ");
        }

        System.out.print("\n\nSegundo vetor --> | ");
        for (int i = 0; i < secondArray.length ; i++){
            System.out.print(secondArray[i] + " | ");
        }

        System.out.print("\n\nVetor de multiplicação --> | ");
        for (int i = 0; i < multiplyArray.length ; i++){
            System.out.print(multiplyArray[i] + " | ");
        }

        System.out.print("\n\nVetor de divisão --> | ");
        for (int i = 0; i < divideArray.length ; i++){
            System.out.print(divideArray[i] + " | ");
        }
    }
}