package design.pattern.mix.commandandresponsibility.bo;

import java.util.List;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class CommandVO {

	public final static String DIVIDE_FLAG = " ";

	public final static String PREFIX = "-";

	private String commandName;

	private List<String> paramList = Lists.newArrayList();

	private List<String> dataList = Lists.newArrayList();

	public CommandVO(String commandName) {
		if (!Strings.isNullOrEmpty(commandName)) {
			String[] commands = commandName.split(DIVIDE_FLAG);
			this.commandName = commands[0];
			for (int i = 1; i < commands.length; i++) {
				String command = commands[i];
				if (command.indexOf(PREFIX) != -1) {
					this.paramList.add(command.replace(PREFIX, "").trim());
				} else {
					this.dataList.add(command.trim());
				}
			}
		} else {
			System.out.println("命令解析失败，请输入正确的命令...");
		}

	}

	public String getCommandName() {
		return commandName;
	}

	public List<String> getParamList() {
		if (this.paramList.isEmpty()) {
			this.paramList.add("");
		}
		return Lists.newArrayList(Sets.newHashSet(this.paramList));
	}

	public List<String> getDataList() {
		return dataList;
	}

	public static void main(String[] args) {
		CommandVO vo = new CommandVO("ls -l -l /user");
		List<String> paramList = vo.getParamList();
		List<String> dataList = vo.getDataList();
		System.out.println("命令：" + vo.getCommandName());
		System.out.println("--------------");
		System.out.println("选项：");
		for (String string : paramList) {
			System.out.println(string);
		}
		System.out.println("--------------");
		System.out.println("操作数：");
		for (String string : dataList) {
			System.out.println(string);
		}
	}

}
