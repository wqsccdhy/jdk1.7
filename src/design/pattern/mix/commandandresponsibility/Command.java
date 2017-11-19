package design.pattern.mix.commandandresponsibility;

import java.util.List;

import com.google.common.collect.Lists;

import design.pattern.mix.commandandresponsibility.util.ClassUtils;

public abstract class Command implements ICommand {

	protected final List<? extends CommandName> buildChain(Class<? extends CommandName> abstractClass) {

		List<Class<?>> classes = ClassUtils.getSonClass(abstractClass);

		List<CommandName> commandNameList = Lists.newArrayList();

		for (Class<?> c : classes) {
			CommandName commandName = null;
			try {
				commandName = (CommandName) Class.forName(c.getName()).newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (commandNameList.size() > 0) {
				CommandName command = commandNameList.get(commandNameList.size() - 1);
				command.setNextOperator(commandName);
			}
			commandNameList.add(commandName);
		}

		return commandNameList;
	}

}
