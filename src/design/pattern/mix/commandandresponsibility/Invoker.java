package design.pattern.mix.commandandresponsibility;

import design.pattern.mix.commandandresponsibility.bo.CommandVO;
import design.pattern.mix.commandandresponsibility.mixenum.CommandEnum;

public class Invoker {

	public String exec(String _commandStr) {

		String result = "";

		CommandVO vo = new CommandVO(_commandStr);
		if (CommandEnum.getNames().contains(vo.getCommandName())) {
			// 产生命令对象
			String className = CommandEnum.valueOf(vo.getCommandName()).getValue();

			Command command = null;
			try {
				command = (Command) Class.forName(className).newInstance();
				result = command.execute(vo);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;

	}

}
