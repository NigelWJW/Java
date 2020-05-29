package interpreter;

import java.util.HashMap;

/**
 * ����������Ž����� ���ÿ��������ţ���ֻ���Լ��������������й�ϵ��
 * ���������������п���Ҳ��һ�������Ľ�������ۺ������ͣ�����Expression���ʵ����
 */
public class SymbolExpression extends Expression {
	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	//��Ϊ SymbolExpression ������������ʵ�֣���� interpreter ��һ��Ĭ��ʵ��
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return 0;
	}
}
