package Presentacion.Reserva;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Presentacion.Controller.Controller;
import Presentacion.Controller.Events;
import Presentacion.Controller.IGUI;

public class VCompraServicio_OK extends JFrame implements IGUI{	
	
	public void update(Object data) {
		JOptionPane.showMessageDialog(this, "Compra realizada con �xito");
		Controller.obtenerInstancia().accion(Events.ABRIR_VRESERVA, null);
	}
}
