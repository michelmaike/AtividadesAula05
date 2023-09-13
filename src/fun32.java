public class fun32 {
    public static void main(String[] args) {
        String[] nome = new String[10];
        for(int L = 0; L < 10; L++) {
            System.out.println("Digite a palavra em letras minúsculas " + (L+1));
            nome[L] = System.console().readLine();
            nome[L] = restantes(nome[L], nome[L].length(), "c");
        }
        for(int L = 0; L < 10; L++) {
            System.out.println("\n" + (L + 1) + " - " + nome[L]);
        }
        System.out.println("\n");
    }

    public static String restantes(String vet, int tam, String x) {
        int cont = 0;
        StringBuilder criacao = new StringBuilder(vet);
        for(int i = 0; i < tam; i++) {
            if (criacao.charAt(i) == x.charAt(0)) {
                criacao.setCharAt(i, '*');
                cont++;
            }
        }
        return criacao.toString();
    }
}
