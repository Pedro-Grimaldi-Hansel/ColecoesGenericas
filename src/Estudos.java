import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Estudos {
    public static void main(String[] args){
        HashMap<String,Integer> cidadesHabitantes = new HashMap();

        cidadesHabitantes.put("Goinia",4356554);
        cidadesHabitantes.put("São Paulo",4356571);
        cidadesHabitantes.put("Brasília",4356554);

        Set set= cidadesHabitantes.entrySet();

        Iterator i = set.iterator();

        while (i.hasNext()){
            Map.Entry entrada = (Map.Entry)i.next();
            System.out.println("Chave: "+entrada.getKey());
        }
    }
}
