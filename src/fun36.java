public class fun36 {
    public static void main(String[] args){
        int L, c, t, t1;
        String[] nome = new String[3];
        String[] prof = new String[3];
        String[] ender = new String[3];
        for(L=0; L<3; L++){
            System.out.println("Digite um nome: ");
            nome[L] = System.console().readLine();
            System.out.println("Digite um endereço: ");
            ender[L] = System.console().readLine();
            System.out.println("Digite a profissão: ");
            prof[L] = System.console().readLine();
        }
        for(L=0; L<2; L++){
            for(c=L+1; c<3; c++){
                if(nome[L].compareTo(nome[c]) > 0){
                    troca(nome[L], nome[c]);
                    troca(ender[L], ender[c]);
                    troca(prof[L], prof[c]);
                }
            }
        }
        for(L=0; L<3; L++){
            System.out.println(nome[L]+"\t"+ender[L]+"\t"+prof[L]);
        }
        System.out.println("");

    }
    public static void troca(String n1, String n2){
        String aux;
        aux = n1;
        n1 = n2;
        n2 = aux;
    }
}
