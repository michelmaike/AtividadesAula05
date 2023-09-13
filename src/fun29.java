public class fun29 {
    public static void main(String[] args){
        int L, n;
        int[] num = new int[10];
        for(L=0; L<10; L++){
            System.out.print("Digite um numero : "+(L+1)+": ");
            num[L] = Integer.parseInt(System.console().readLine());
        }
            
        inverte(num, 10);

        System.out.println("VETOR");

        for(L=0; L<10; L++){
            System.out.println((L+1)+" - "+num[L]);
        }
        System.out.println("");
        
    }
    public static void inverte(int[] vet, int max){
        int k, i, aux;
        k = max;
        for(i=0; i<max/2; i++){
            aux = vet[i];
            k--;
            vet[i] = vet[k];
            vet[k] = aux;
        }
    }
}
