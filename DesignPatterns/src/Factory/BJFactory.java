package Factory;
//这是北京工厂子类
public class BJFactory implements AbsFactory {
    @Override
    public Pizza2 createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza2 pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }

}
