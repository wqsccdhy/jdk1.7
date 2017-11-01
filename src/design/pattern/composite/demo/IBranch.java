package design.pattern.composite.demo;

import java.util.List;

public interface IBranch {

	void addSubordinate(AbsGroup group);

	List<AbsGroup> getSubordinate();

}
