package State;

public abstract class Estado {
    protected Player player;
    
    public Estado(Player player) {
        this.player = player;
    }
    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevius();
}
