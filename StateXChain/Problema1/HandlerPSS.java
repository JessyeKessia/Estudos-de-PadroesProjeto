package StateXChain.Problema1;

public interface HandlerPSS {
    void setNext(HandlerPSS proximo);
    void handle(Candidato candidato);
}
