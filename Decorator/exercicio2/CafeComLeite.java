package Decorator.exercicio2;

public class CafeComLeite extends CafeDecorator{
    
    public CafeComLeite(Cafe cafe) {
        super(cafe);
    }

    public String getDescricao() {
        return super.getDescricao() + " com leite";
    }
    public double getPreco() {
        return super.getPreco() + 0.5;
    }

}
