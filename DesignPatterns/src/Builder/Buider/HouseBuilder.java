package Builder.Buider;

/**
 * 抽象的建造者
 */
public abstract class HouseBuilder {

    protected House house = new House();//house产品类组合进来

    //将建造的流程写好, 抽象的方法
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    //建造房子好， 将产品(房子) 返回给用户
    public House buildHouse() {
        return house;
    }

}
