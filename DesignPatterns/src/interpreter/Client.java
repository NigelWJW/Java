package interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 解释器模式- 当一个语言需要解释执行，可将该语言的句子表示为一个抽象树。应用场景是编译器、
 * 运算表达式计算、正则表达式、机器人等，但是解释器模式会带来类膨胀而且引用递归调用可能会让程序
 * 很复杂
 * 在Spring的SpelExpressionParser类使用了解释器模式。Expression是接口表达式类似我们的Expression接口
 * 下面不同的实现类比如SpelExpression、CompositeStringExpression、LiteralExpression.
 * 会根据不同的Parse对象返回不同的Expression对象
 */
public class Client {
	public static void main(String[] args) throws IOException {
		String expStr = getExpStr(); // a+b
		HashMap<String, Integer> var = getValue(expStr);// var {a=10, b=20}
		Calculator calculator = new Calculator(expStr);
		System.out.println("运算结果：" + expStr + "=" + calculator.run(var));
	}

	// 获得表达式
	public static String getExpStr() throws IOException {
		System.out.print("请输入表达式：");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}

	// 获得值映射
	public static HashMap<String, Integer> getValue(String expStr) throws IOException {
		HashMap<String, Integer> map = new HashMap<>();
		for (char ch : expStr.toCharArray()) {
			if (ch != '+' && ch != '-') {
				if (!map.containsKey(String.valueOf(ch))) {
					System.out.print("请输入" + String.valueOf(ch) + "的值：");
					String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					map.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}

		return map;
	}
}
