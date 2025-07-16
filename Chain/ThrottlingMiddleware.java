package Chain;

public class ThrottlingMiddleware extends Middleware {
    protected int requestPerMinute;
    protected int request;
    protected long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request++;
        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            return false;
        }
        return checkNext(email, password);
    }
}
