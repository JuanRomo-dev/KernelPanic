package Presentacion.Command.Habitacion;

import Negocio.FactoriaNegocio.FactoriaSA;
import Negocio.Habitacion.SAHabitacion;
import Negocio.Habitacion.THabitacion;
import Presentacion.Command.Command;
import Presentacion.Command.Context;
import Presentacion.Controller.Events;


public class EditarHabitacion2Command implements Command {

	@Override
	public Context executeCommand(Object data) {
		FactoriaSA fsa = FactoriaSA.getInstance();
		SAHabitacion sah = fsa.generarSAHabitacion();
		int res = sah.editarHabitacion((THabitacion) data);
		
		Context resContext = null;
		if(res == Events.ERROR_HABITACION_DATOS){
			resContext = new Context(Events.MODIFICAR_HABITACION_KO, "Error:Datos incorrectos");	
		}
		else if(res == Events.ERROR_HABITACION_NUM_YA_EXISTE){
			resContext = new Context(Events.MODIFICAR_HABITACION_KO, "Error:Ya existe una habitaci�n con este n�mero");	
		}
		else{
			resContext = new Context(Events.MODIFICAR_HABITACION_OK, res);
		}
		return resContext;
	}
}