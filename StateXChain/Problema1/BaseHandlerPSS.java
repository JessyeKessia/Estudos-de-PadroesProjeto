package StateXChain.Problema1;

public class BaseHandlerPSS implements HandlerPSS {
    protected HandlerPSS proximo;

    // ele que diz quem vai ser o próximo na fila
    public void setNext(HandlerPSS proximo) {
        this.proximo = proximo;
    }

    // passa para o candidato para a próxima fase, caso não passar encerra quando chega em Null
    public void handle (Candidato candidato) {
        if (proximo != null) {
            proximo.handle(candidato);
        }
    }


}
