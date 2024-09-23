
package agenda.telefonica;


public class AgendaTelefonica {

  
    public static void main(String[] args) {
        
      ventana inicio = new ventana(); 
      inicio.setTitle("Agenda telefonica");  
      inicio.setBounds(420, 185, 600, 300);
      inicio.setResizable(false); 
      inicio.insertarPanel();
      inicio.insertarEtiquetas();
      inicio.insertarTexto();
      inicio.insertatBoton();
        
    }
    
}
