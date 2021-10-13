import java.util.ArrayList;
import java.util.*;

public class p1 {
    public static void main(String[] args) {
        /*String snombre = "alb erto fer alf al7 dez dez alb san chez";

        String arraySeccion[] = s.split(" ");
        for (int i = 0; i < arraySeccion.length; i++) {
            if (arraySeccion[i].length() % 2 != 0) {
                System.out.println(arraySeccion[i]);
            }
        }
        */
        String snombre ="alb erto fer alf al7 dez dez alb san chez";
        /*
        String apalabras []= snombre.split(" ");
        List aliguales= new ArrayList();
        for (int i = 0; i < apalabras.length; i++)
        {
            for (int j = 0; j <apalabras.length ; j++)
            {
                if (apalabras[i].equals(apalabras[j]) && !aliguales.contains(apalabras[i]) && (i!=j))
                {
                    aliguales.add(apalabras[i]);
                }
            }
        }
    System.out.println(aliguales.size());*/
        String[] saux=snombre.split(" ");
        for (int i=0;i<saux.length;i++)
        {
            if (!saux[i].equals("") && saux[i].substring(0,2).equals("al")){
                //saux[i].charAt(0=='a'&&saux[i].charAt(1)=='l'
                saux[i]=saux[i].replace('a','2');
                saux[i]=saux[i].replace('e','2');
                saux[i]=saux[i].replace('i','2');
                saux[i]=saux[i].replace('o','2');
                saux[i]=saux[i].replace('u','2');
        }
        System.out.println(saux[i]);
        }

    }
}





















