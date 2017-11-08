
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables
    private DisplayDosCaracteres aAno;
    private DisplayDosCaracteres aMes;
    private DisplayDosCaracteres aDia;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // initialise instance variables
        aAno = new DisplayDosCaracteres(100);
        aMes = new DisplayDosCaracteres(13);
        aDia = new DisplayDosCaracteres(31);
    }

    /**
     * Fijar fecha
     */
    public void fijarFecha (int bAno, int bMes, int bDia)
    {
        aAno.setValorAlmacenado(bAno);
        aMes.setValorAlmacenado(bMes);
        aDia.setValorAlmacenado(bDia);
    }

    /**
     * Obtener fecha
     */
    public String obtenerFecha()
    {
        String fechaDevuelta;
        fechaDevuelta = aDia.getTextoDelDisplay() + "-" + aMes.getTextoDelDisplay() + "-" + aAno.getTextoDelDisplay();
        return fechaDevuelta;
    }
    
    public void avanzarfecha()
    {
        aDia.incrementaValorAlmacenado();
        if (aDia.getValorAlmacenado() == 1){
            aMes.incrementaValorAlmacenado();
        if (aMes.getValorAlmacenado() == 1){
            aAno.incrementaValorAlmacenado();
        }
    }
        
    }
}