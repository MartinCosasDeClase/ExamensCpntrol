public class Hora {
    private int hora, minuts;

    public Hora(int hora, int minuts){
        this.hora = hora;
        this.minuts = minuts;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuts() {
        return minuts;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }


    public String toString(){
        return "L'hora es " + this.hora + ":" + this.minuts;
    }
}
