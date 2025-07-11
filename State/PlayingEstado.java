package State;

public class PlayingEstado extends Estado{
    public PlayingEstado(Player player) {
        super(player);
    }
    public String onLock() {
        System.out.println("Música parando...");
        player.changeEstado(new LockedEstado(player));
        return "Bloqueado!";
    }
    public String onPlay() {
        String action = player.startPlayback();
        player.changeEstado(new PlayingEstado(player));
        return action;
    }
    public String onNext() {
        return player.nextTrack();
    }
    public String onPrevius() {
        return player.previousTrack();
    }
}
