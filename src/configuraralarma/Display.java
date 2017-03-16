
package configuraralarma;

/**
 * pantalla de visualización
 * @author Mario
 */
public class Display {
    /**
     * 
     * @param hora en la que se configura la hora de la alarma
     */
    public static void imprimeHoraAlarma(int hora){
        System.out.println("Hora alarma");
    }
    /**
     * 
     * @param minutos recibe los minutos de la config de la alarma
     */
    public static void imprimeMinutosAlarma(int minutos){
       
        System.out.println("Minutos alarma"+minutos);
    }
    /**
     * para visualizar la hora actual
     * @param horaActual recibe la hora actual
     */
   public void imprimeHoraActual(int horaActual){
       System.out.println("hora actual"+ horaActual);
   }
   
   /**
    * para visualizar la hora actual
    * @param minutoActual visualiza los minutos actuales
    */
       public void impriMinutoActual(int minutoActual){
           System.out.println("minuto actual"+minutoActual);
       }    
}
