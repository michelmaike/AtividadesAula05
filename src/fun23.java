public class fun23 {
    public static void main(String[] args) {
        int num, base, c;

        System.out.println("Digite um número maior ou igual a 0: ");
        num = Integer.parseInt(System.console().readLine());
        
        while(num < 0){
            System.out.println("Número negativo. Digite um numero maior ou igual a 0: ");
            num = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Digite a base em que deseja representa-lo (2-10): ");
        base = Integer.parseInt(System.console().readLine());

        while(base<2 || base>10){
            System.out.println("Não sei converter. Digite a base em que deseja representa-lo (2-10): ");
            base = Integer.parseInt(System.console().readLine());
        }

        c = converte(num, base);
        System.out.println("Número em decimal: "+num);
        System.out.println("Numero na base "+base+" : "+c);
        System.out.println("");
        System.out.println("");
    }
    public static int converte(int nnum, int nbase) {
        int nb, r, b;
        b = 0;
        nb = 0;
        while(nnum >= nbase){
            r = nnum % nbase;
            nb += Math.pow(10, b) * r;
            nnum = nnum / nbase;
            b++;
        }
        nb += Math.pow(10, b) * nnum;
        return nb;

    }
   
}
