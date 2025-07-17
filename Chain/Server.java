package Chain;

import java.util.HashMap;
import java.util.Map;

public class Server {
    protected Map<String, String> users = new HashMap<>();
    protected Middleware middleware;

    public void setMiddleware (Middleware middleware) {
        this.middleware = middleware;
    };
    public boolean login(String email, String password) {
        if (hasEmail(email) == true && isValidPassWord(email, password) == true) {
              System.out.println("Login bem-sucedido!");
              return true;
        } else {
            System.out.println("Login com erro!");
            return false;
        }
    }
    public void register(String email, String password){
        users.put(email, password);
    }
    public boolean hasEmail (String email){
        if (!email.contains(email)) {
            System.out.println("E-mail: " + email + " não cadastrado!");
            return false;
        } else {
            return true;
        }
    }
    public boolean isValidPassWord (String email, String password) {
        String storedPassword = users.get(email);

        if (storedPassword != null && storedPassword.equals(password))  {
            System.out.println("Senha correta!");
            return true;
        } else {
            System.out.println("Senha incorreta!");
            return false;
        }
    }

}
