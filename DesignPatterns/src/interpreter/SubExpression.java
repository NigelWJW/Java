package interpreter;

import java.util.HashMap;

/**
 * ����������
 */
public class SubExpression extends SymbolExpression {
	public SubExpression(Expression left, Expression right) {
		super(left, right);//�̳и���ĳ�ʼ��
	}

	//���left �� right ���ʽ�����Ľ��
	public int interpreter(HashMap<String, Integer> var) {//��Ϊ�̳еĸ����left\right��super
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}
