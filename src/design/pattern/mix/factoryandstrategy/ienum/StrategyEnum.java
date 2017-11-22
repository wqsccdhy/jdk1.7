package design.pattern.mix.factoryandstrategy.ienum;

/**
 * 枚举策略
 * 
 * @author Administrator
 *
 */
public enum StrategyEnum {
	SteadyDeduction("design.pattern.mix.factoryandstrategy.strategy.impl.SteadyDeduction"), 
	FreeDeduction("design.pattern.mix.factoryandstrategy.strategy.impl.FreeDeduction");

	private String value;

	private StrategyEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
