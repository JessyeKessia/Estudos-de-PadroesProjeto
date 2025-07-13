package State;

import java.util.ArrayList;
import java.util.List;

public class Player {
    protected Estado estado;
    protected boolean Playing = false;
    protected List<String> playlist = new ArrayList<>();
    protected int currentTrack = 0;

    public Player() {
       for (int i = 1; i <= 12; i++) {
            playlist.add("Música " + i);
        }
        this.estado = new ReadyEstado(this);
    }
    public void changeEstado(Estado estado){
        this.estado = estado;
    }
    public Estado getEstado(){
        return estado;
    }
    public void setPlaying(boolean play){ 
        if (play == true){
            this.Playing = true;
        } else {
            this.Playing = false;
        }
    }
    public boolean isPlaying() {
        return Playing;
    }
    public String startPlayback() {
        return "trilha" + currentTrack;
    }
    public String nextTrack() {
        currentTrack = (currentTrack + 1) % playlist.size();
        return startPlayback();
    }
    public String previousTrack() {
        currentTrack = (currentTrack - 1 + playlist.size()) % playlist.size();
        return startPlayback();
    }
    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }
     // Delegando para o estado atual:
    public String onPlay() { return estado.onPlay(); }
    public String onStop() { return estado.onLock(); }
    public String onNext() { return estado.onNext(); }
    public String onPrevious() { return estado.onPrevius(); }
}
