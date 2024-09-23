
package agenda.telefonica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

    
     public class ventana extends JFrame{
    JPanel panelInicio = new JPanel();
    JTextField txtValor1 = new JTextField();
    JTextField txtValor2 = new JTextField();
    JTextField txtValor3 = new JTextField();
    
    int valor1 = 0;
    
    public ventana(){
    this.setVisible(true); 
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);   
      
    }
    
     public void insertarPanel(){               
        
        this.getContentPane().add(panelInicio);      
        panelInicio.setLayout(null); 
     
        
    }      
     
      public void insertarEtiquetas(){
        JLabel lblValor1 = new JLabel("Telefono");
        lblValor1.setBounds(49,20, 200, 100);
        panelInicio.add(lblValor1);
        
         JLabel lblValor2 = new JLabel("Nombre");
        lblValor2.setBounds(50,75, 200, 100);
        panelInicio.add(lblValor2);
        
        JLabel lblValor3 = new JLabel("Correo");
         lblValor3.setBounds(50,130, 200, 100);
        panelInicio.add(lblValor3);
        
      }
 
        public void insertarTexto(){       
       
        txtValor1.setBounds(120, 60, 225, 25);
        panelInicio.add(txtValor1);
        txtValor1.repaint();

        txtValor2.setBounds(120, 112, 225, 25);
        panelInicio.add(txtValor2);
        txtValor2.repaint();
        
        txtValor3.setBounds(120, 167, 225, 25);
        panelInicio.add(txtValor3);
        txtValor2.repaint();
    }
    
        public void insertatBoton(){

       JButton btguardar = new JButton("Guardar");
        btguardar.setBounds(350, 60, 95, 50);
        panelInicio.add(btguardar);
        btguardar.repaint();
        
        
        JButton btac = new JButton("Actualizar");
        btac.setBounds(350, 140, 95, 50);
        panelInicio.add(btac);
        btac.repaint();
            
         JButton btbuscar = new JButton("Buscar");
        btbuscar.setBounds(460, 60, 95, 50);
        panelInicio.add(btbuscar);
        btbuscar.repaint();
              
       JButton bteliminar = new JButton("Eliminar");
       bteliminar.setBounds(460, 140, 95, 50);
       panelInicio.add(bteliminar);
       bteliminar.repaint();
        
    }      
}
