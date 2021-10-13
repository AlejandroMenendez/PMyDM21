import java.util.ArrayList;
import java.util.HashMap;
public class p3 {
    public static void main(String[] args)
    {
        //clave/key jugador y value/valor equipo.
        HashMap<String, String> hmjugadores=new HashMap<String, String>();
        hmjugadores.put("esteban","barcelona");
        hmjugadores.put("sebas","pozuelo");
        hmjugadores.put("alex","retamar");
        hmjugadores.put("juan","madrid");
        hmjugadores.put("vinicius","madrid");
        hmjugadores.put("ramos","psg");
        System.out.println(hmjugadores);
        System.out.println("el equipo de recio es "+hmjugadores.get("recio"));
        System.out.println("el equipo de recio es "+hmjugadores.get("RECIO"));
        System.out.println(getKeysFromValue("madrid",hmjugadores));

        HashMap<String, String> hmnacion=new HashMap<String, String>();
        hmnacion.put("esteban","portugal");
        hmnacion.put("sebas","portugal");
        hmnacion.put("alex","españa");
        hmnacion.put("juan","francia");
        hmnacion.put("vinicius","francia");
        hmnacion.put("ramos","francia");
        int numeroj=getnumero("madrid","francia",hmjugadores,hmnacion);
        System.out.println(numeroj);

    }

    private static int getnumero(String sequipo, String spais, HashMap<String, String> juga, HashMap<String, String> naci)
    {
        ArrayList<String> todos=getKeysFromValue(sequipo,juga);
        int contador=0;
        for (String i:todos)
        {
            if (naci.get(i).equals(spais))
            {
             contador++;
            }
       }
        return contador;
    }

    private static ArrayList<String> getKeysFromValue(String sValue, HashMap<String, String> hmap)
    {
        ArrayList<String> resultado=new ArrayList<String>();
        for (String i: hmap.keySet())
        {
            if (hmap.get(i).equals(sValue))
            {
                resultado.add(i);
            }
        }
        return resultado;
    }
}
