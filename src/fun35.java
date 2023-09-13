public class fun35 {
    public static void main(String[] args) {
        int L, c, aux;
        int[] num = new int[10];
        for (L=0; L<10; L++) {
            System.out.println("Digite um número "+(L+1) + ": ");
            num[L] = Integer.parseInt(System.console().readLine());
        }
        c = verificaordem(num, 10);
        if (c == 1) {
            System.out.println("ORDENAÇÃO CRESCENTE");
        } else if (c == 2) {
            System.out.println("ORDENAÇÃO DECRESCENTE");
        } else {
            System.out.println("NÃO ESTÁ ORDENADO");
        }
        System.out.println("");
    }

    public static int busca(int[] vet, int tam) {
        int i, x;
        for (i=0; i<tam - 1; i++) {
            if (vet[i] < vet[i+1]) {
                x = 0;
                return (x);
            }
        }
        x = 1;
        return (x);
    }

    public static int busca1(int[] vet, int tam) {
        int i, x;
        for (i=0; i<tam - 1; i++) {
            if (vet[i]>  vet[i+1]) {
                x = 0;
                return (x);
            }
        }
        x = 1;
        return (x);
    }

    public static int verificaordem(int[] vetor, int t) {
        int r, res;
        r = busca(vetor, t);
        if (r == 1) {
            res = 2;
            return (res);
        } else {
            r = busca1(vetor, t);
            if (r == 1) {
                res = 1;
                return (res);
            } else {
                res = 0;
                return (res);
            }
        }
    }
}
