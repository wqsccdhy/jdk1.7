package design.pattern.mix.commandandresponsibility.mixenum;

import java.util.List;

import com.google.common.collect.Lists;

public enum CommandEnum {

	ls("design.pattern.mix.commandandresponsibility.impl.LSCommand");

	private String value = "";

	private CommandEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static List<String> getNames() {
		CommandEnum[] values = CommandEnum.values();
		List<String> list = Lists.newArrayListWithCapacity(values.length);
		for (CommandEnum commandEnum : values) {
			String name = commandEnum.name();
			list.add(name);
		}
		return list;
	}

	public static void main(String[] args) {
		List<String> name2 = CommandEnum.getNames();
		for (String string : name2) {
			System.out.println(string);
		}

		CommandEnum[] values = CommandEnum.values();
		for (CommandEnum commandEnum : values) {
			String value2 = commandEnum.getValue();
			System.out.println(value2);
		}
	}

}
