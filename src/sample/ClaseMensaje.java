package sample;

import java.io.Serializable;

public class ClaseMensaje implements Serializable {

    public String nickname;
    public String mensaje;

    public ClaseMensaje(String nickname, String mensaje){
        this.mensaje=mensaje;
        this.nickname=nickname;
    }

    public ClaseMensaje(){}

    public ClaseMensaje(String nickname){
        this.nickname=nickname;
    }

    public String getNickname() {
        return nickname;
    }
    public String getMensaje() {
        return mensaje;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}