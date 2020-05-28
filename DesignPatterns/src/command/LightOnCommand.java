package command;

/**
 * 具体命令类-将接受者和动作绑定在一起，调用接受者相应操作实现命令执行
 */
public class LightOnCommand implements Command {
    //聚合LightReceiver
    LightReceiver light;

    //构造器，将灯接收者聚合进来
    public LightOnCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        //调用灯接收者的方法
        light.on();
    }

    @Override
    public void undo() {
        //调用灯接收者的方法
        light.off();
    }

}
