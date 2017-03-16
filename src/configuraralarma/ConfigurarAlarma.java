
package configuraralarma;

import javax.swing.JOptionPane;


public class ConfigurarAlarma {
    
    
    
    /**se llama al metodo imprimeHoraAlarma que recibe y visualiza la misma
     * sirve para configurar la hora de la alarma
     * @return hora ,devuelve la hora a la que se pone la alarma
     */
    public int horaAlarma(){
        Display.imprimeHoraAlarma(0);
      int hora = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la hora"));
       return hora;
       
       
    }
    /**
     * sirve para devolver los minutos de la alarma
     * se llama a displayImprimeMinutosAlarma para visualizar y recibir los mismos
     * @return los minutos de la alarma
     */
    public int minutoAlarma(){
        Display.imprimeMinutosAlarma(0);
       int minuto = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los minutos"));
       return minuto;
    }
    
   /**
    * 
    * sirve para apagar o encender la alarma,tiene dos posiciones.
    */
    public void alarmaOnOff(){
      int selecciona;
     
      do{
     selecciona =Integer.parseInt(JOptionPane.showInputDialog("1. ON \n 2. OFF"));
       switch(selecciona){
           
           case 1: JOptionPane.showInputDialog("Alarma activada");
           break;
           case 2:JOptionPane.showConfirmDialog(null,"Alarma desactivada");
       }
       
      
      
    }while(selecciona!=0);
    }
    
     /**
     * si las horas y minutos actuales coinciden con las de  la alarma salta la misma.
     * @param minutoActual minuto actual
     * @param horaActual hora actual
     * @param hora hora de la alarma
     * @param minutos minutos de la alarma
     * llamada a AltavozSaltaalarma.
     */
    public  void saltaAlarma(int minutoActual,int horaActual,int hora,int minutos){
    Altavoz.melodiaAlarma();
         if(minutoActual==minutos&&horaActual==hora){
              System.out.println("Hora de la alarma");
         }   
        
       
    }
    /**
     *  para detener la alarma,el boton también hace una llamada al método paramelodia de altavoz
     */
    public void stopAlarma(){
        
        System.out.println("paro alarma");
        Altavoz.pararMelodia();
    }
}
