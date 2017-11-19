package design.pattern.mix.commandandresponsibility.impl;

import design.pattern.mix.commandandresponsibility.AbstractLS;
import design.pattern.mix.commandandresponsibility.bo.CommandVO;
import design.pattern.mix.commandandresponsibility.util.FileManager;

public class LS extends AbstractLS {

	@Override
	public String getOperateParam() {
		return AbstractLS.DEFAULT_PARAM;
	}

	@Override
	public String echo(CommandVO vo) {
		return FileManager.ls("");
	}

}
