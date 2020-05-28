package command;

/**
 * 具体命令类-将接受者和动作绑定在一起，调用接受者相应操作实现命令执行
 */
public class LightOffCommand implements Command {
    // 聚合LightReceiver
    LightReceiver light;

    // 构造器
    public LightOffCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        light.off();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        light.on();
    }
}
