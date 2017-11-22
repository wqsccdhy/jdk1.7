package design.pattern.mix.factoryandstrategy.strategy.impl;

import design.pattern.mix.factoryandstrategy.po.Card;
import design.pattern.mix.factoryandstrategy.po.Trade;
import design.pattern.mix.factoryandstrategy.strategy.IDeduction;

/**
 * 自由扣款策略
 * 
 * @author Administrator
 *
 */
public class FreeDeduction implements IDeduction {

	@Override
	public boolean exec(Card card, Trade trade) {
		int amount = trade.getAmount();
		int freeMoney = card.getFreeMoney();
		if (freeMoney >= amount) {
			card.setFreeMoney(freeMoney - amount);
			return true;
		} else {
			return false;
		}

	}

}
