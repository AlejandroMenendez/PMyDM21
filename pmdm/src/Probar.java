import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Probar
{

    public static void main(String[] args)
    {

        Peliculas p1 = new Peliculas();
        p1.setManio(1991);
        //System.out.println(p1.getM_nAnio());
        Peliculas p2 = new Peliculas();
        Peliculas p3 = new Peliculas();
        p3 = p3.peliantigua(p1,p2);
        //System.out.println(p3.toString());

        //hacer un array de 5 peliculas, luego imprimir la pelicula mas antigua.
        //imprimir los que tengan el mismo director y categoría.

        //Crear un hashmap indexado por titulo de las 5 peliculas.

        List<Peliculas> alPeliculas = new ArrayList<Peliculas>();
        alPeliculas.add(new Peliculas("tiburon","juanjo","drama",2000,90));
        alPeliculas.add(p1);
        alPeliculas.add(p2);
        alPeliculas.add(p3);
        alPeliculas.add(new Peliculas());

        Peliculas ooo=getPeliMasAntigua(alPeliculas);
        System.out.println("la mas antigua es: "+ooo);

        List<Peliculas> GG=getPelidirect(alPeliculas);
        List<Peliculas> GG2=getdirectycat(alPeliculas);

        System.out.println("mismi director: "+GG);
        System.out.println("mismi director: "+GG2);

        HashMap<String,Peliculas> hmtitulopeli=new HashMap<String,Peliculas>();
        for (Peliculas peli1:alPeliculas)
        {
            hmtitulopeli.put(peli1.getMtitulo(),peli1);
        }

    }

    private static List<Peliculas> getdirectycat(List<Peliculas> alPeliculas) {
        List<Peliculas> pelisaux=new ArrayList<Peliculas>();
        for(Peliculas peli1:alPeliculas)
        {
            int nNum=nocurdireccat(peli1,alPeliculas);
            if (nNum>1)
            {
                pelisaux.add(peli1);
            }
        }
        return pelisaux;
    }

    private static List<Peliculas> getPelidirect(List<Peliculas> alPeliculas)
    {
        List<Peliculas> pelisaux=new ArrayList<Peliculas>();
        for(Peliculas peli1:alPeliculas)
        {
            int nNum=nocurrencias(peli1,alPeliculas);
            if (nNum>1)
            {
                pelisaux.add(peli1);
            }
        }
        return pelisaux;
    }

    private static int nocurrencias(Peliculas pelicula, List<Peliculas> alPeliculas)
    {
        int ncontocu=0;
        for (Peliculas peli1:alPeliculas)
        {
            if (pelicula.getMdirector().equalsIgnoreCase(peli1.getMdirector()))
            {
                ncontocu++;
            }
        }
        return ncontocu;
    }

    private static int nocurdireccat(Peliculas pelicula, List<Peliculas> alPeliculas)
    {
        int ncontocu=0;
        for (Peliculas peli1:alPeliculas)
        {
            if (pelicula.getMdirector().equalsIgnoreCase(peli1.getMdirector())&&
                    (pelicula.getMcategoria().equalsIgnoreCase(peli1.getMcategoria())))
            {
                ncontocu++;
            }
        }
        return ncontocu;
    }

    public static Peliculas getPeliMasAntigua(List<Peliculas> alPeliculas)
    {
        Peliculas peliaux = new Peliculas();
        peliaux.setManio(9999);
        for (Peliculas peli1:alPeliculas)
        {
            if (peli1.getManio()<peliaux.getManio())
            {
                peliaux=peli1;
            }
        }
        return peliaux;
    }


}