package design.pattern.mix.commandandresponsibility.test;

import design.pattern.mix.commandandresponsibility.Invoker;

public class MixTest {

	public static void main(String[] args) {

		Invoker invoker = new Invoker();
		String _commandStr = "ls -l";
		String exec = invoker.exec(_commandStr);
		System.out.println(exec);

	}

}
