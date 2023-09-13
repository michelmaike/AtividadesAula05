public class fun41 {
    public static void main(String[] args){
        int[] num = new int[5];
        int L, flag, op;
        flag = 0;

        for(L=0; L<5; L++){
            do{
                System.out.println("");
                System.out.println("MENU VETOR - FUNCAO ");
                System.out.println("1 - Dados do vetor ");
                System.out.println("2 - Ordena vetor ");
                System.out.println("3 - Imprime vetor ");
                System.out.println("4 - Sai do programa ");
                System.out.println("Opção: ");
                op = Integer.parseInt(System.console().readLine());
                switch(op){
                    case 1: entrada(num, 5);
                    flag = 1;
                    break;

                    case 2: if(flag == 1){
                        ordena(num, 5);
                    }
                    else{
                        System.out.println("Escolha primeiro opção 1");
                    }
                    break;

                    case 3: if(flag == 1){
                        imprime(num, 5);
                    }
                    else{
                        System.out.println("Escolha primeiro opção 1");
                    }
                    break;

                    case 4: System.out.println("Saindo do programa!");
                    break;

                    default: System.out.println("Opção invalida!");
                }
            }while(op != 4);
            System.out.println("");
        }
    }
    public static int[] entrada(int[] vet, int t){
        int L;
        System.out.println("Entrada do vetor ");
        for(L=0; L<t; L++){
            System.out.println("Digite numero: "+(L+1)+": ");
            vet[L] = Integer.parseInt(System.console().readLine());
        }
        return(vet);
    }

    public static int[] imprime(int[] vet, int t){
        int L;
        System.out.println("VETOR");
        for(L=0; L<t; L++){
            System.out.println((L+1)+" - "+vet[L]);
        }
        return(vet);
    }
    public static int[] ordena(int[] vet, int tam){
        int L1, c1, aux;
        for(L1=0; L1<tam -1; L1++){
            for(c1=L1+1; c1<tam; c1++){
                if(vet[L1] > vet[c1]){
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
        return(vet);
    }
}
