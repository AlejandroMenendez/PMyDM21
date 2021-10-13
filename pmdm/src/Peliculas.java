public class Peliculas
{
    //atributos
    private String mtitulo;
    private String mdirector;
    private String mcategoria;
    private int manio;
    private int mduracion;
    //constructor
    public Peliculas(String mtitulo, String mdirector, String mcategoria, int manio, int mduracion) {
        this.mtitulo = mtitulo;
        this.mdirector = mdirector;
        this.mcategoria = mcategoria;
        this.manio = manio;
        this.mduracion = mduracion;
    }
    public Peliculas()
    {
        this.mtitulo = "nisu";
        this.mdirector = "antonio";
        this.mcategoria = "comedia";
        this.manio = 1990;
        this.mduracion = 120;
    }


    //metodos
    public String getMtitulo() {
        return mtitulo;
    }

    public void setMtitulo(String mtitulo) {
        this.mtitulo = mtitulo;
    }

    public String getMdirector() {
        return mdirector;
    }

    public void setMdirector(String mdirector) {
        this.mdirector = mdirector;
    }

    public String getMcategoria() {
        return mcategoria;
    }

    public void setMcategoria(String mcategoria) {
        this.mcategoria = mcategoria;
    }

    public int getManio() {
        return manio;
    }

    public void setManio(int manio) {
        this.manio = manio;
    }

    public int getMduracion() {
        return mduracion;
    }

    public void setMduracion(int mduracion) {
        this.mduracion = mduracion;
    }

    /***
     * peli mas antigua
     * @param p1 Peliculas
     * @param p2 Peliculas
     */
    public Peliculas peliantigua(Peliculas p1, Peliculas p2)
    {
        if(p1.getManio()>p2.getManio())
        {
            return p2;
        }
        else if (p1.getManio()==p2.getManio())
        {
            return null;
        }
        return p1;
    }
    public Peliculas peliantigua(Peliculas p1, Peliculas p2,Peliculas p3)
    {
        return peliantigua((peliantigua(p1,p2)==null)?p1:peliantigua(p1,p2),p3);
    }
    public Peliculas peliantigua2(Peliculas p1, Peliculas p2,Peliculas p3)
    {
        Peliculas paux=peliantigua(p1,p2);
        if (paux !=null)
        {
            return peliantigua(paux,p3);
        }
        return peliantigua(p1,p3);
    }
    public Peliculas peliantigua(Peliculas p1, Peliculas p2,Peliculas p3,Peliculas p4)
    {
        Peliculas paux=peliantigua(p1,p2,p3);
        if (paux !=null)
        {
            return peliantigua(paux,p4);
        }
        return peliantigua(p1,p4);
    }
    @Override
    public String toString()
    {
        return "titulo: "+this.mtitulo+" año: "+this.manio+" duracion "+this.mduracion+"\n";
    }




}
