package design.pattern.mix.factoryandstrategy.po;

/**
 * IC卡类
 * 
 * @author Administrator
 *
 */
public class Card {

	// IC卡号
	private String cardNo = "";

	// 固定金额
	private int steadMoney = 0;

	// 自由金额
	private int freeMoney = 0;

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public int getSteadMoney() {
		return steadMoney;
	}

	public void setSteadMoney(int steadMoney) {
		this.steadMoney = steadMoney;
	}

	public int getFreeMoney() {
		return freeMoney;
	}

	public void setFreeMoney(int freeMoney) {
		this.freeMoney = freeMoney;
	}

}
