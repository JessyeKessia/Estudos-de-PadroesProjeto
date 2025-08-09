package Decorator.exercicio2;

public class Main {
    public static void main(String[] args) {
        
        Cafe meuCafe = new CafeSimples();

        System.out.println(meuCafe.getDescricao() + " - R$ " + meuCafe.getPreco());

        Cafe cafecomchantily = new CafeComChantily(meuCafe);
        System.out.println(cafecomchantily.getDescricao() + " - R$ " + cafecomchantily.getPreco());
    }
    
}
