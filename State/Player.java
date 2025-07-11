package State;

import java.util.ArrayList;
import java.util.List;

public class Player {
    protected Estado estado;
    protected boolean Playing = false;
    protected List<String> playlist = new ArrayList<>();
    protected int currentTrack = 0;

    public Player() {
        this.estado = new ReadyEstado(null);
    }
    public void changeEstado(Estado estado){
        this.estado = estado;
    }
    public Estado gEstado(){
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
        return "Play ligado!";
    }
    public String nextTrack() {
        currentTrack = currentTrack + 1;
        return "Agora está tocando a trilha" + currentTrack;
    }
    public String previousTrack() {
        currentTrack = currentTrack - 1;
        return "Agora está tocando a trilha " + currentTrack;
    }
    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }
}
