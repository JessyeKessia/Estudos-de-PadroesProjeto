package Decorator.exercicio2;

public class CafeComChantily extends CafeDecorator {
    
    public CafeComChantily(Cafe cafe) {
        super(cafe);
    }

    public String getDescricao() {
        return super.getDescricao() + " com Chantily";
    }
    public double getPreco() {
        return super.getPreco() + 1.5;
    }
}
