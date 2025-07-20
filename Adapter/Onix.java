public class Onix implements VehicleBrasileiro {
    @Override
    public double getVelocidadeKMH(boolean turbo) {
        double velocidade = 167;
        return turbo ? velocidade * 1.3 : velocidade;
    }
}
