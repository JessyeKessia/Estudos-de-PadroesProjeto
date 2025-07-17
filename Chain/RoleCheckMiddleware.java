package Chain;

public class RoleCheckMiddleware extends Middleware {
    
    public boolean check(String email, String password) {
        if (email.equals("admin")) {
            System.out.println("Você é o admin");
            return true;
        }
        System.out.println("Olá, user");
        return true;
    }
}
