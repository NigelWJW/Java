package interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * ������ģʽ- ��һ��������Ҫ����ִ�У��ɽ������Եľ��ӱ�ʾΪһ����������Ӧ�ó����Ǳ�������
 * ������ʽ���㡢������ʽ�������˵ȣ����ǽ�����ģʽ����������Ͷ������õݹ���ÿ��ܻ��ó���
 * �ܸ���
 * ��Spring��SpelExpressionParser��ʹ���˽�����ģʽ��Expression�ǽӿڱ��ʽ�������ǵ�Expression�ӿ�
 * ���治ͬ��ʵ�������SpelExpression��CompositeStringExpression��LiteralExpression.
 * ����ݲ�ͬ��Parse���󷵻ز�ͬ��Expression����
 */
public class Client {
	public static void main(String[] args) throws IOException {
		String expStr = getExpStr(); // a+b
		HashMap<String, Integer> var = getValue(expStr);// var {a=10, b=20}
		Calculator calculator = new Calculator(expStr);
		System.out.println("��������" + expStr + "=" + calculator.run(var));
	}

	// ��ñ��ʽ
	public static String getExpStr() throws IOException {
		System.out.print("��������ʽ��");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}

	// ���ֵӳ��
	public static HashMap<String, Integer> getValue(String expStr) throws IOException {
		HashMap<String, Integer> map = new HashMap<>();
		for (char ch : expStr.toCharArray()) {
			if (ch != '+' && ch != '-') {
				if (!map.containsKey(String.valueOf(ch))) {
					System.out.print("������" + String.valueOf(ch) + "��ֵ��");
					String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					map.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}

		return map;
	}
}
