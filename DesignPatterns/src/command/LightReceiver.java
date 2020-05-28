package command;

/**
 * 灯接收者-被命令，知道如何实施和执行请求
 */
public class LightReceiver {
    public void on() {
        System.out.println(" 电灯打开了.. ");
    }

    public void off() {
        System.out.println(" 电灯关闭了.. ");
    }
}
