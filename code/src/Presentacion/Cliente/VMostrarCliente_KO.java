package Presentacion.Cliente;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Presentacion.Controller.Controller;
import Presentacion.Controller.Events;
import Presentacion.Controller.IGUI;

public class VMostrarCliente_KO extends JFrame implements IGUI{
	public void update(Object data) {
		JOptionPane.showMessageDialog(this, "Error al buscar cliente");
		Controller.obtenerInstancia().accion(Events.ABRIR_VCLIENTE, null);
	}
}
