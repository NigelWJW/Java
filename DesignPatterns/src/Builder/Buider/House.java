package Builder.Buider;

/**
 * 产品类，一个具体的产品对象，组合到抽象建造者里
 */
//产品->Product
public class House {

    private String baise;//属性
    private String wall;
    private String roofed;

    //get、set方法
    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

}
