public class Examen {
    private String asignatura;
    private int aula;
    private Data data;
    private Hora hora;

    public Examen(String asignatura, int aula, Data data, Hora hora){
        this.asignatura = asignatura;
        this.aula = aula;
        this.data = data;
        this.hora = hora;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public int getAula() {
        return aula;
    }

    public Data getData() {
        return data;
    }

    public Hora getHora() {
        return hora;
    }
    public String toString(){
        return "El examen de " + this.asignatura + " es en l'aula " + this.aula + "\n" + this.data.toString() + "\n" + this.hora.toString();
    }
}


