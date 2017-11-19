package design.pattern.mix.commandandresponsibility;

import design.pattern.mix.commandandresponsibility.bo.CommandVO;

public interface ICommand {

	public String execute(CommandVO vo);

}
