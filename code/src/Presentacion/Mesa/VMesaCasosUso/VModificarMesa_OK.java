package Presentacion.Mesa.VMesaCasosUso;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Presentacion.Controller.Controller;
import Presentacion.Controller.Events;
import Presentacion.Controller.IGUI;

public class VModificarMesa_OK extends JFrame implements IGUI{
	public void update(Object data) {
		JOptionPane.showMessageDialog(this, "Mesa modificada");
		Controller.obtenerInstancia().accion(Events.ABRIR_VMESA, null);
	}
}
