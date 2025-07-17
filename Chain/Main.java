package Chain;

public class Main {
    public static void main(String[] args) {
        // Cria o servidor
        Server server = new Server();

        // Registra alguns usuários
        server.register("admin", "admin");
        server.register("jessyekessia@gmail.com", "12345");

        // Configura a cadeia de responsabilidade (middleware)
        // Primeiro checa se a requisição não exece as 2
        // Segundo ver se o usuário existe
        // Depois olha se é admin ou user
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                  .linkWith(new RoleCheckMiddleware());

        // Define o middleware no servidor
        server.setMiddleware(middleware);

        // Simula tentativas de login
        boolean success;
        do {
            System.out.println("\nDigite seu email:");
            String email = System.console().readLine();

            System.out.println("Digite sua senha:");
            String password = new String(System.console().readPassword());

            success = server.login(email, password);
        } while (!success);
    }
}

