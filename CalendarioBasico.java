
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables
    private int ano;
    private int mes;
    private int dia;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // initialise instance variables
        ano = 1;
        mes = 1;
        dia = 1;
    }

    /**
     * Fijar fecha
     */
    public void fijarFecha (int aAno, int aMes, int aDia)
    {
        ano = aAno;
        mes = aMes;
        dia = aDia;  
    }

    /**
     * Obtener fecha
     */
    public String obtenerFecha()
    {
        String textoADevolver = "";
        String parte1 = dia + "";
        String parte2 = mes + "";
        String parte3 = ano + "";
        if (parte1.length() < 2) {
            parte1 = "0" + parte1;  
        }
        if (mes < 10) {
            parte2 = "0" + parte2;

            if (ano < 10) {
                parte3 = "0" + parte3;
            }
            textoADevolver = parte1 + "-" + parte2 + "-" + parte3;
            
        }
        return textoADevolver;
    }
    
    public void avanzarfecha()
    {
        dia = dia +1;
        if (dia == 31){
            dia = 1;
            mes = mes +1;
            if (mes == 13) {
                mes = 1;
                ano += 1;
            }
    }
}
}