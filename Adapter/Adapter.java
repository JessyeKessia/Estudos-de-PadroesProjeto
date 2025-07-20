// CLASSE QUE IRA ADAPTAR A VELOCIDADE PARA O O MPH
// essa classe implementa o veiculo USA, mas recebe o veiculo brasileiro para formatar
public class Adapter implements Vehicle {
    // pega aqui o automovel brasileiro
    private VehicleBrasileiro automovel;

    //construtor que recebe esse automovel brasileiro
    public Adapter (VehicleBrasileiro automovel) {
        this.automovel = automovel;
    }

    // adapta a velocidade para o padrão americano
    @Override
    public double getSpeed() {
       double velocidadeKMH = automovel.getVelocidadeKMH(true);
       return velocidadeKMH / 1.609;
    }
}
