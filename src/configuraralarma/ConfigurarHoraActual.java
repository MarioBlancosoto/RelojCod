
package configuraralarma;

import javax.swing.JOptionPane;


public class ConfigurarHoraActual {
    
    /**
     * configuración de  hora actual
     * @return devuelve horaACtual para si coincide con la alarma activar la misma
     */
    public int horaActual(){
        int horaActual =Integer.parseInt(JOptionPane.showInputDialog(null,"esta es la hora actual"));
       return horaActual;
    }
    /**
     * configuración de minutos actuales
     * @return devuelve minutosActuales para saber si coincide con los minutos de la alarma.
     */
    public int minutoActual(){
        int minutoActual = Integer.parseInt(JOptionPane.showInputDialog("estos los minutos actuales"));
        
        return minutoActual;
    }
    
}
