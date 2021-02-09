package javamanipulacionbd;

import controlador.ControlUsuario;
import modelo.Consultas;
import modelo.Usuario;
import vista.VistaUsuario;

public class JavaManipulacionBD {
    
    public static void main(String args[]){
        Consultas query = new Consultas();
        Usuario user = new Usuario();
        VistaUsuario view = new VistaUsuario();
       
        ControlUsuario controlador = new ControlUsuario(user, query, view);
        controlador.inicar();
        view.setVisible(true);
        
    }
    
}
