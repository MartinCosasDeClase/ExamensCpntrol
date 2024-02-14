public class Data {
    private int dia, mes, any;
    public Data(int dia, int mes, int any){
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAny() {
        return any;
    }
    public String toString(){
        return "La data es " + this.dia + " de " + this.mes + " del " + this.any;
    }
}
