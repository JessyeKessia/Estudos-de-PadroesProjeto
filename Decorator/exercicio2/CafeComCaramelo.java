package Decorator.exercicio2;

public class CafeComCaramelo extends CafeDecorator {
    
    public CafeComCaramelo(Cafe cafe) {
        super(cafe);
    }
     public String getDescricao() {
        return super.getDescricao() + " com caramelo";
    }
    public double getPreco() {
        return super.getPreco() + 1.3;
    }

}