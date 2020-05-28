package command;

/**
 * 电视接收者-被命令，知道如何实施和执行请求
 */
public class TVReceiver {
    public void on() {
        System.out.println(" 电视机打开了.. ");
    }

    public void off() {
        System.out.println(" 电视机关闭了.. ");
    }
}
