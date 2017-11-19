package design.pattern.mix.commandandresponsibility.impl;

import design.pattern.mix.commandandresponsibility.AbstractLS;
import design.pattern.mix.commandandresponsibility.bo.CommandVO;
import design.pattern.mix.commandandresponsibility.util.FileManager;

public class LS_L extends AbstractLS {

	@Override
	public String getOperateParam() {
		// TODO Auto-generated method stub
		return AbstractLS.L_PARAM;
	}

	@Override
	public String echo(CommandVO vo) {
		// TODO Auto-generated method stub
		return FileManager.ls_l("");
	}

}
