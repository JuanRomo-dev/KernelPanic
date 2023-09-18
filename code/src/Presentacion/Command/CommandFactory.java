/**
 * 
 */
package Presentacion.Command;

public abstract class CommandFactory {
	private static CommandFactory instance;

	public static CommandFactory getInstance() {
		if (instance == null) {
			instance = new CommandFactoryImp();
		}
		return instance;
	}

	abstract public Command getCommand(Integer event);
}