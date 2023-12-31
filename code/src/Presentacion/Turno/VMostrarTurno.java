package Presentacion.Turno;

import Presentacion.Controller.Controller;
import Presentacion.Controller.Events;
import Presentacion.Controller.IGUI;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class VMostrarTurno extends JFrame implements IGUI {
	private static final long serialVersionUID = 1L;
	
	private Controller controller;
	private int _id;	
	
	public VMostrarTurno(){
		super("Mostrar Turno Por ID");
		controller = Controller.obtenerInstancia();
		initIGUI();
	}
	
	public void initIGUI() {
		//Panel principal
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		setContentPane(mainPanel);

		//Panel de datos
		JPanel idInfoPanel = new JPanel();
		mainPanel.add(idInfoPanel);
		
		//ID
		idInfoPanel.add(new JLabel("ID: "));
		JSpinner idSpin = new JSpinner(new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1));
		idInfoPanel.add(idSpin);
		idSpin.setPreferredSize(new Dimension(50, 20));
		_id = (Integer) idSpin.getValue();
		idSpin.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				_id = (Integer) idSpin.getValue();
			}
		});		
		
		//Panel de botones
		JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		mainPanel.add(buttonsPanel);

		//Boton OK
		JButton okB = new JButton("OK");
		buttonsPanel.add(okB);

		okB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.accion(Events.MOSTRAR_TURNO_ID, _id);
				setVisible(false);
			}
		});

		//Boton Cancelar
		JButton cancelB = new JButton("Cancel");
		buttonsPanel.add(cancelB);

		cancelB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				controller.accion(Events.ABRIR_VTURNO, null);
			}
		});

		pack();
		setLocationRelativeTo(getParent());
		setVisible(true);
	}

	@Override
	public void update(Object data) {
	}
	
}