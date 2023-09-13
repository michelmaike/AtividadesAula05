public class fun27 {
    public static void main(String[] args){
        int L, c;
        int[] num = new int[6];
        String[] num1 = new String[6];

        for(L=0; L<6; L++){
            System.out.println("Digite um numero : "+(L+1)+": ");
            num[L] = Integer.parseInt(System.console().readLine());
        }
        for(L=0; L<6; L++){
            System.out.println("Digite o caractere : "+(L+1)+": ");
            num1[L] = System.console().readLine();
        }
        System.out.println("");

        multivetor(num, num1, 6);

        System.out.println("");
    }
    public static void multivetor(int[]vet1, String[]vet2, int tam){
        int i, w;
        for(i=0; i<tam; i++){
            System.out.println("");
            for(w=0; w<vet1[i]; w++){
                System.out.print(vet2[i]);
            }
        }
    }
}
