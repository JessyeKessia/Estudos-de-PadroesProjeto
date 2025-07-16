package Chain;

public abstract class Middleware {
    // esse método é recursivo, ele mesmo se refere a ele!
    // recebe o próximo
    protected Middleware next;

    // passa para o próximo setando
    public Middleware linkWith(Middleware next) {
        return this.next = next;
    }

    public abstract boolean check(String email, String password);

    // Método recursivo
    protected boolean checkNext(String email, String password) {
        if (this.next == null) {
            return true; 
        } else {
            return this.next.check(email, password);
        }
    } 
}

