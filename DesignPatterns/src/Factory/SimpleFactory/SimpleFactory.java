package Factory.SimpleFactory;
/**
 * 披萨简单工厂，把创建披萨对象放在一个类中，这样我们新增披萨类就只用修改这里即可
 * Calendar类使用了简单工厂类，Calendar的getInstance方法中的createCalendar方法
 * 里面根据对象创建实例
 */
public class SimpleFactory {
    public Pizza creatPizza(String orderType){//简单工厂类的创建函数
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨 ");
        }
        return pizza;
    }

//    public static Pizza createPizza2(String orderType) {//写成类函数
//        Pizza pizza = null;
//    if (orderType.equals("greek")) {
//        pizza = new GreekPizza();
//        pizza.setName(" 希腊披萨 ");
//    } else if (orderType.equals("cheese")) {
//        pizza = new CheesePizza();
//        pizza.setName(" 奶酪披萨 ");
//    } else if (orderType.equals("pepper")) {
//        pizza = new PepperPizza();
//        pizza.setName(" 胡椒披萨 ");
//    }
//        return pizza;
//    }

}