package Presentacion.Menu.VMenuCasosDeUso;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Presentacion.Controller.Controller;
import Presentacion.Controller.Events;
import Presentacion.Controller.IGUI;

public class VAniadirProducto_OK  extends JFrame implements IGUI{
	public void update(Object data) {
		JOptionPane.showMessageDialog(this, (String)data);
		Controller.obtenerInstancia().accion(Events.ABRIR_VMENU, null);
	}
}
