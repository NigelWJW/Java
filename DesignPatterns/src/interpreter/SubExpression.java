package interpreter;

import java.util.HashMap;

/**
 * 减法解释器
 */
public class SubExpression extends SymbolExpression {
	public SubExpression(Expression left, Expression right) {
		super(left, right);//继承父类的初始化
	}

	//求出left 和 right 表达式相减后的结果
	public int interpreter(HashMap<String, Integer> var) {//因为继承的父类的left\right用super
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}
