import java.util.ArrayList;
import java.util.List;

public class p2 {
    public static void main(String[] args) {
        /*
        List<Integer>alnumimpar=new ArrayList<Integer>();
        for (int i = 0; i < 101; i=i+2) {
            alnumimpar.add(i);
        }
        String scoma="";
        for (Integer numeroI:alnumimpar)
        {
            System.out.print(scoma+numeroI);
            scoma=",";
        }*/
/*
        List<String> marcas=new ArrayList<String>();
        marcas.add("seat");
        marcas.add("fiat");
        marcas.add("bmw");
        marcas.add("ferrari");
        marcas.add("audi");
        marcas.add("citroen");
        marcas.add("opel");
        marcas.add("mini");
        marcas.add("smart");
        marcas.add("hyundai");
        List<String> bingo=new ArrayList<String>();
        int $x=0;
        for (int i = 0; i < 5;)
        {
            $x=(int)(Math.random()*9);
            if (!bingo.contains(marcas.get($x)))
            {
                bingo.add(marcas.get($x));
                i++;
            }
        }
        String scoma="";
        for (String carton:bingo)
        {
            System.out.print(scoma+carton);
            scoma=",";
        }*/
        //generar n cartones de tal manera q no este ninguno repetido
        //(q no contengan las 5 marcas)
        List<String> marcas=new ArrayList<String>();
        marcas.add("seat");
        marcas.add("fiat");
        marcas.add("bmw");
        marcas.add("ferrari");
        marcas.add("audi");
        marcas.add("citroen");
        marcas.add("opel");
        marcas.add("mini");
        marcas.add("smart");
        marcas.add("hyundai");

        ArrayList<List<String>> contenedorcarton = new ArrayList<>();

        List<String> bingo2=generarCarton(marcas);
        imprimir(bingo2);

        int numerototal=40;
        for (int i = 0; i < numerototal; i++) {
            List<String> cartonI=generarCarton(marcas);
            if (!existecarton(cartonI,contenedorcarton))
            {
                contenedorcarton.add(cartonI);
                imprimir(cartonI);
            }
        }
    }
//cartoni se va a comparar, contenedor estructura de carton utilizado
    private static boolean existecarton(List<String> cartonI, ArrayList<List<String>> contenedorcarton)
    {
        for (int i = 0; i < contenedorcarton.size(); i++)
        {
            List<String> cartonaux=contenedorcarton.get(i);
            if (comparar(cartonI,cartonaux))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean comparar(List<String> cartonI, List<String> cartonaux)
    {
        for (int  i = 0;  i <cartonI.size();  i++)
        {
            if (!cartonI.contains(cartonaux.get(i)))
            {
                return false;
            }
        }
        return true;
    }

    private static void imprimir(List<String> cartonInt) {
        String scoma="";
        for (String carton: cartonInt)
        {
            System.out.print(scoma+carton);
            scoma=",";
        }
        System.out.println();
    }

    private static List<String> generarCarton(List<String> pruebaInt) {
        List<String> carton=new ArrayList<String>();
        int $x=0;
        for (int i = 0; i < 5;)
        {
            $x=(int)(Math.random()*9);
            if (!carton.contains(pruebaInt.get($x)))
            {
                carton.add(pruebaInt.get($x));
                i++;
            }
        }
        return carton;
    }
}
