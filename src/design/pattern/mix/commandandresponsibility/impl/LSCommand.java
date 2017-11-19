package design.pattern.mix.commandandresponsibility.impl;

import java.util.List;

import design.pattern.mix.commandandresponsibility.AbstractLS;
import design.pattern.mix.commandandresponsibility.Command;
import design.pattern.mix.commandandresponsibility.CommandName;
import design.pattern.mix.commandandresponsibility.bo.CommandVO;

public class LSCommand extends Command {

	@Override
	public String execute(CommandVO vo) {
		List<? extends CommandName> buildChain = super.buildChain(AbstractLS.class);
		CommandName commandName = buildChain.get(0);
		return commandName.handle(vo);
	}

}
