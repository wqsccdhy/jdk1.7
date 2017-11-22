package design.pattern.mix.factoryandstrategy.strategy.impl;

import design.pattern.mix.factoryandstrategy.po.Card;
import design.pattern.mix.factoryandstrategy.po.Trade;
import design.pattern.mix.factoryandstrategy.strategy.IDeduction;

/**
 * 固定扣款策略
 * 
 * @author Administrator
 *
 */
public class SteadyDeduction implements IDeduction {

	@Override
	public boolean exec(Card card, Trade trade) {
		int amount = (int) Math.rint(trade.getAmount() / 2);
		int freeMoney = card.getFreeMoney();
		int steadMoney = card.getSteadMoney();
		if (freeMoney >= amount && steadMoney >= amount) {
			card.setFreeMoney(freeMoney - amount);
			card.setSteadMoney(steadMoney - amount);
			return true;
		} else {
			return false;
		}
	}

}
