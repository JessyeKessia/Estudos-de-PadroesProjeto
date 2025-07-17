package Chain;

public class UserExistsMiddleware extends Middleware  {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }
    
    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("E-mail não registrado");
            return false;
        }
        if (!server.isValidPassWord(email, password)) {
            System.out.println("Senha errada");
            return false;
        }
        return checkNext(email, password);
    }
}
