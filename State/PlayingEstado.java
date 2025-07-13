package State;

public class PlayingEstado extends Estado{
    public PlayingEstado(Player player) {
        super(player);
    }
    public String onLock() {
        player.setPlaying(false);
        player.setCurrentTrackAfterStop();
        player.changeEstado(new LockedEstado(player));
        return "Parado e travado.";
    }
    public String onPlay() {
        player.setPlaying(false);
        player.changeEstado(new ReadyEstado(player));
        return "Pausado.";
    }
    public String onNext() {
        return player.nextTrack();
    }
    public String onPrevius() {
        return player.previousTrack();
    }
}
