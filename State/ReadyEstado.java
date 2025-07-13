package State;

public class ReadyEstado extends Estado {
    
    public ReadyEstado(Player player) {
        super(player);
    }
    public String onLock() {
        System.out.println("Bloqueando...");
        player.changeEstado(new LockedEstado(player));
        return "Bloqueado!";
    }
    public String onPlay() {
        player.setPlaying(true);
        player.changeEstado(new PlayingEstado(player));
        return "Reproduzindo: " + player.startPlayback();
    }
    public String onNext() {
        return "Travado";
    }
    public String onPrevius() {
        return "Travado";
    }
}
