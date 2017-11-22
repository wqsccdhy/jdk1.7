package design.pattern.mix.factoryandstrategy.factory;

import design.pattern.mix.factoryandstrategy.ienum.StrategyEnum;
import design.pattern.mix.factoryandstrategy.strategy.IDeduction;

/**
 * 策略工厂
 * 
 * @author Administrator
 *
 */
public class StrategyFactory {

	public static IDeduction getDeduction(StrategyEnum strategyEnum) {
		IDeduction deduction = null;

		try {
			deduction = (IDeduction) Class.forName(strategyEnum.getValue()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return deduction;

	}

}
