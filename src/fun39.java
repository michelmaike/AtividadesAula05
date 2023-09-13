public class fun39 {
    public static void main(String[] args){
        int L, c, n, aux;
        int[] num = new int[10];
        for(L=0; L<10; L++){
            System.out.println("Digite um numero: "+(L+1)+": ");
            num[L] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Digite o numero de buscas: ");
        n = Integer.parseInt(System.console().readLine());

        ordena(num, 10);

        c = busca(num, 10, n);
        System.out.println("VETOR");
        for(L=0; L<10; L++){
            System.out.println((L+1)+" - "+num[L]);
        }
        c++;
        if(c!=0){
            System.out.println("Posição no vetor: "+c);
        }
        else{
            System.out.println("NÃO ENCONTRADO");
        }
        System.out.println("");
    
    }
    public static int busca(int[] vet, int tam, int chave){
        int i, ini, meio, fim, n;
        ini = 0;
        fim = tam -1;
        while(ini <= fim){
            meio = (ini + fim)/2;
            if(chave == vet[meio]){
                return(meio);
            }
            else{
                if(chave < vet[meio]){
                    fim = meio -1;
                }
                else{
                    ini = meio +1;
                }
            }
        }
        meio = (-1);
        return(meio);
    }
    public static void ordena(int[] vet, int tam){
        int L1, c1, aux;
        for(L1=0; L1<tam-1; L1++){
            for(c1=L1+1; c1<tam; c1++){
                if(vet[L1] > vet[c1]){
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }

}
