
package ordena_vetor;

import java.util.Arrays;

public class Ordena_Vetor {


    public static void main(String[] args) {
        
        String[] v1 = {"E","F","B","D","H","C","A","G"};
        
        String[] v2 = {"E","F","B","D","H","C","A","G"};
        
        String[] v3 = {"E","F","B","D","H","C","A","G"};
        
        int contFor = 0, contIf = 0, contAtrib = 0;
        long tempoInicial = System.nanoTime();
        
        Dreco1: 
        System.out.println("|----------------------------------------------------");
        System.out.println("| PROBLEMA 1 (BubbleSort): "+Arrays.toString(v1));
        System.out.println("|----------------------------------------------------");
        
        tempoInicial = System.nanoTime();
        contFor = contIf = contAtrib = 0;
        
        for (int i= 0; i<v1.length; i++)
        {   
            for(int j=1; j<v1.length; j++){    
                if (v1[j-1].compareTo(v1[j]) >0){
                    String aux = v1[j-1];
                    v1 [j-1] = v1[j];
                    v1[j] = aux;
                    contIf++;
                }
                contFor++;
                contAtrib++;
            }
            contAtrib++;
        }
        
        System.out.println("| ORDENAÇÃO: "+Arrays.toString(v1));
        System.out.println("| Quantidade de Repetições For:" + contFor);
        System.out.println("| Quantidade de Repetições IF:" + contIf);
        System.out.println("| Quantidade de Iterações:" + contAtrib);
        System.out.printf("| Tempo de Execução: %.3f milisegundos ", 
                (float)(System.nanoTime() - tempoInicial)/1000000 );
        System.out.println("\n");
        
        
        Dreco2:
        System.out.println("|----------------------------------------------------");
        System.out.println("| PROBLEMA 2 (SelectionSort): "+Arrays.toString(v2));
        System.out.println("|----------------------------------------------------");
        tempoInicial = System.nanoTime();
        
        contFor = contIf = contAtrib = 0;
            for (int i= 0; i<v2.length-1; i++){                
                int menor = i;  
                for( int j = (i + 1); j < v2.length; j++){ 
                    if (v2[j].compareTo(v2[menor]) < 0){
                        menor = j;
                        contIf++;
                    }
                    contFor++;
                    contAtrib++;
                }
                String aux = v2[i];
                v2[i] = v2[menor];
                v2[menor] = aux;
                contAtrib++;
            }
        System.out.println("| ORDENAÇÃO: "+Arrays.toString(v2));      
        System.out.println("| Quantidade de Repetições For:" + contFor);
        System.out.println("| Quantidade de Repetições IF:" + contIf);
        System.out.println("| Quantidade de Iterações:" + contAtrib);
        System.out.printf("| Tempo de Execução: %.3f milisegundos ", 
                (float)(System.nanoTime() - tempoInicial)/1000000 );
        System.out.println("\n");

        
        Dreco3:
        System.out.println("|----------------------------------------------------");
        System.out.println("| PROBLEMA 3: "+Arrays.toString(v3));
        System.out.println("|----------------------------------------------------");
        
        tempoInicial = System.nanoTime();
        contFor = contAtrib = 0;
        
        for (int  i = 1; i < v3.length; i++){
            
            String aux = v3[i];
            int j = i-1;
            while((j >= 0) && (aux.compareTo(v3[j]) <= 0)){
                v3[j+1] = v3[j];
                j = j-1;
                contFor++;
                contAtrib++;
            }
            v3[j+1] = aux;
            contAtrib++;
        }
        System.out.println("| ORDENAÇÃO: "+Arrays.toString(v3)); 
        System.out.println("| Quantidade de Repetições While:" + contFor);
        System.out.println("| Quantidade de Iterações:" + contAtrib);
        System.out.printf("Tempo de Execução: %.3f milisegundos ", 
                (float)(System.nanoTime() - tempoInicial)/1000000 );
        System.out.println("\n");
        
        
    }
    
}
