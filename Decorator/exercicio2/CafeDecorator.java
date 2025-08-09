package Decorator.exercicio2;

public class CafeDecorator implements Cafe {
    
    protected Cafe wrappee;

    public CafeDecorator(Cafe cafe) { 
        this.wrappee = cafe; 
    }

    public String getDescricao() {
        return wrappee.getDescricao();
    }

    public double getPreco() {
        return wrappee.getPreco();
    }

}
