package design.pattern.mix.commandandresponsibility;

import design.pattern.mix.commandandresponsibility.bo.CommandVO;

public interface ICommandName {

	public String getOperateParam();

	public String echo(CommandVO vo);

}
