package design.pattern.mix.factoryandstrategy.strategy;

import design.pattern.mix.factoryandstrategy.po.Card;
import design.pattern.mix.factoryandstrategy.po.Trade;

/**
 * 扣款策略接口
 * 
 * @author Administrator
 *
 */
public interface IDeduction {

	/**
	 * 扣款、提供交易和卡信息进行扣款，并返回扣款是否成功
	 * 
	 * @param card
	 * @param trade
	 * @return
	 */
	public boolean exec(Card card, Trade trade);

}
