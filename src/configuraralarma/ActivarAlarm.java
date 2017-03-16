
package configuraralarma;

import javax.swing.JOptionPane;


public class ActivarAlarm {

 /**
  * selector de botones
  * @param args 
  */
    public static void main(String[] args) {
         ConfigurarAlarma config = new ConfigurarAlarma();
        
        int select;
        do{
         select = Integer.parseInt(JOptionPane.showInputDialog("Configure su alarma"));
        
        switch(select){
            
            case 1: config.horaAlarma();
            break;
            case 2: config.minutoAlarma();
            break;
            case 3: config.alarmaOnOff();
            break;
            case 4: config.saltaAlarma(15, 30, 17, 25);
            break;
            case 5 : System.exit(0);
            
        }
        
        
    }while(select!=0);
    
  
    }
}
