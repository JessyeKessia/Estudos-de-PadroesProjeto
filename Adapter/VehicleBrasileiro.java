/* em quilômetros por hora (km/h) e necessidade de informar se o motor tem turbo
(aumenta em 30% a velocidade nominal). */
public interface VehicleBrasileiro {
    // velocidade é pega em KM por Hora, além disso
    // tem o turbo que pode ter ou não na velociade
    double getVelocidadeKMH(boolean turbo);
}