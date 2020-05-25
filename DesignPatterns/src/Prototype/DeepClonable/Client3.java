package Prototype.DeepClonable;

/**
 * 浅拷贝对于基本数据类型的成员，直接进行值传递，相当与复制一份给新对象
 * 浅拷贝对于引用数据类型，进行引用拷贝，就是把内存地址复制给对象，克隆羊就是浅拷贝，使用
 * sleep = (Sleep)super.clone()默认就是浅拷贝
 * 深拷贝复制所有成员变量，为所有引用数据成员变量申请存储空间，也就是对整个对象进行拷贝
 */
public class Client3 {

    public static void main(String[] args) throws Exception {
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        //方式1 完成深拷贝
//		DeepProtoType p2 = (DeepProtoType) p.clone();
//		System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//		System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

        //方式2 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.deepClone();
        System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
    }
}
