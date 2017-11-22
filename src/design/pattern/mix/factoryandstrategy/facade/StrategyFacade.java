package design.pattern.mix.factoryandstrategy.facade;

import design.pattern.mix.factoryandstrategy.factory.StrategyFactory;
import design.pattern.mix.factoryandstrategy.ienum.StrategyEnum;
import design.pattern.mix.factoryandstrategy.po.Card;
import design.pattern.mix.factoryandstrategy.po.Trade;
import design.pattern.mix.factoryandstrategy.strategy.DeductionContext;
import design.pattern.mix.factoryandstrategy.strategy.IDeduction;

/**
 * 策略门面封装
 * 
 * @author Administrator
 *
 */
public class StrategyFacade {

	public static Card deduct(Card card, Trade trade) {

		StrategyEnum strategyEnum = getDeductionType(trade);
		IDeduction iDeduction = StrategyFactory.getDeduction(strategyEnum);
		DeductionContext context = new DeductionContext(iDeduction);
		context.exec(card, trade);
		return card;

	}

	private static StrategyEnum getDeductionType(Trade trade) {
		StrategyEnum strategyEnum = null;
		String tradeNo = trade.getTradeNo();
		if (tradeNo.contains("abc")) {
			strategyEnum = StrategyEnum.FreeDeduction;
		} else {
			strategyEnum = StrategyEnum.SteadyDeduction;
		}
		return strategyEnum;
	}

}
