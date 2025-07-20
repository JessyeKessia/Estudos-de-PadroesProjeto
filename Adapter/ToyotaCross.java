public class ToyotaCross implements VehicleBrasileiro {
    @Override
    public double getVelocidadeKMH(boolean turbo) {
        double velocidadeMaxima = 170;
        return turbo ? velocidadeMaxima * 1.3 : velocidadeMaxima;
    }
}
