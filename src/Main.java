import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Examen> examens = new ArrayList<>();
        examens.add(new Examen("mates",18,new Data(1,1,1),new Hora(1,1) ));
        examens.add(new Examen("historia",20,new Data(2,2,2),new Hora(2,2) ));
        examens.add(new Examen("ciencias",15,new Data(3,3,3),new Hora(3,3) ));
        examens.add(new Examen("literatura",22,new Data(4,4,4),new Hora(4,4) ));
        examens.add(new Examen("geografía",16,new Data(5,5,5),new Hora(5,5) ));

        System.out.println(examens.get(0).toString());
        System.out.println("-------------------------------------------------");
        examens.get(0).getData().setDia(10);
        examens.get(0).getData().setMes(9);
        examens.get(0).getData().setAny(2001);
        examens.get(0).getHora().setHora(16);
        examens.get(0).getHora().setMinuts(30);
        System.out.println(examens.get(0).toString());

        System.out.println("*************************************************");

        for (Examen i: examens){
            System.out.println(i.toString());
        }

        System.out.println("************************************************+");

        Iterator <Examen> iterator = examens.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}
