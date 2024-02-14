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
