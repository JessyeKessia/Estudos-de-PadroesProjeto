package State;

public class LockedEstado extends Estado {
    public LockedEstado(Player player) {
        super(player);
    }
    public String onLock() {
        if (player.isPlaying()) {
            player.setPlaying(false);
            player.changeEstado(new ReadyEstado(player));
            return "Reprodução parada. Modo pronto.";
        }
        return "Já está travado. Ação ignorada.";
    }
    public String onPlay() {
        System.out.println("Desbloqueando...");
        player.changeEstado(new PlayingEstado(player));
        return "Modo desbloqueado!";
    }
    public String onNext() {
        return "Travado";
    }
    public String onPrevius() {
        return "Travado";
    }
}
