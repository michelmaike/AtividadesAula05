public class fun25{
    public static void main(String[] args){
        int L, c, aux;
        int[] num = new int[4];
        int[] num1 = new int[4];

        for(L=0; L<4; L++){
            System.out.println("Digite 1 numero "+(L+1)+": ");
            num[L] = Integer.parseInt(System.console().readLine());
        }
        for(L=0; L<4; L++){
            System.out.println("Digite 2 numero "+(L+1)+": ");
            num1[L] = Integer.parseInt(System.console().readLine());
        }
        c = produtoInterno(num, num1, 4);
        
        System.out.println("VETOR A \t VETOR B ");

        for(L=0; L<4; L++){
            System.out.println(num[L]+"\t"+num1[L]);
        }
        System.out.println("Produto interno: "+c);
        System.out.println("");

    }
    public static int produtoInterno(int[] vet1, int[] vet2, int quant){
        int prod, i;
        prod = 0;
        for(i=0; i<quant; i++){
            prod = prod + (vet1[i] * vet2[i]); 
        }
        return(prod);
    }
}