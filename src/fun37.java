public class fun37 {
    public static void main(String[] args){
        int L, c, t, t1;
        String[][] nome = new String[5][20];
        for(L=0; L<5; L++){
            System.out.println("Digite o nome: ");
            nome[L][0] = System.console().readLine();
        }
        ordena(nome, 5);
        System.out.println("NOMES ORDENADOS ");
        for(L=0; L<5; L++){
            System.out.println((L+1)+" - "+nome[L][0]);
        }
        System.out.println("");
    }
    public static void ordena(String[][] vet, int tam){
        int L1, c1;
        String aux;
        for(L1=0; L1<tam; L1++){
            for(c1=L1+1; c1<tam; c1++){
                if(vet[L1][0].compareTo(vet[c1][0]) > 0){
                    aux = vet[L1][0];
                    vet[L1][0] = vet[c1][0];
                    vet[c1][0] = aux;
                }
            }
        }
    }
}
