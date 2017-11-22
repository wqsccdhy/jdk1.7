package design.pattern.mix.factoryandstrategy;

import design.pattern.mix.factoryandstrategy.facade.StrategyFacade;
import design.pattern.mix.factoryandstrategy.po.Card;
import design.pattern.mix.factoryandstrategy.po.Trade;

public class ClientTest {

	public static void main(String[] args) {

		Card card = initCard();
		Trade trade = initTrade("0001abc");
		System.out.println("--------交易前信息 start----------");
		showCardInfo(card);
		System.out.println("--------交易前信息 end----------");
		Card deduct = StrategyFacade.deduct(card, trade);
		System.out.println("--------交易后信息 start----------");
		showCardInfo(deduct);
		System.out.println("--------交易后信息 end----------");

	}

	private static void showCardInfo(Card card) {
		System.out.println("IC卡编号：" + card.getCardNo());
		System.out.println("IC卡固定余额：" + card.getSteadMoney());
		System.out.println("IC卡自由余额：" + card.getFreeMoney());

	}

	private static Trade initTrade(String tradeNo) {
		Trade trade = new Trade();
		trade.setTradeNo(tradeNo);
		trade.setAmount(60);
		return trade;
	}

	private static Card initCard() {
		Card card = new Card();
		card.setCardNo("Card001");
		card.setFreeMoney(1000);
		card.setSteadMoney(600);
		return card;
	}

}
