package design.pattern.mix.factoryandstrategy.strategy;

import design.pattern.mix.factoryandstrategy.po.Card;
import design.pattern.mix.factoryandstrategy.po.Trade;

/**
 * 封装扣款策略
 * 
 * @author Administrator
 *
 */
public class DeductionContext {

	private IDeduction iDeduction;

	public DeductionContext(IDeduction iDeduction) {
		super();
		this.iDeduction = iDeduction;
	}

	public boolean exec(Card card, Trade trade) {
		return iDeduction.exec(card, trade);
	}

}
