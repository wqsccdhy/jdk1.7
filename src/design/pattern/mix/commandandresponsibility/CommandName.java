package design.pattern.mix.commandandresponsibility;

import design.pattern.mix.commandandresponsibility.bo.CommandVO;

public abstract class CommandName implements ICommandName {

	private CommandName nextOperator;

	public final String handle(CommandVO vo) {
		String result = "";

		// 判断参数是否由自己处理
		if (vo.getParamList().isEmpty() || vo.getParamList().contains(this.getOperateParam())) {
			result = this.echo(vo);
		} else {
			if (this.nextOperator != null) {
				result = this.nextOperator.handle(vo);
			} else {
				result = "命令无法执行";
			}
		}

		return result;

	}

	public void setNextOperator(CommandName nextOperator) {
		this.nextOperator = nextOperator;
	}

}
