package command;

/**
 * 具体命令类-将接受者和动作绑定在一起，调用接受者相应操作实现命令执行
 */
public class TVOffCommand implements Command {
    // 聚合TVReceiver
    TVReceiver tv;

    // 构造器
    public TVOffCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        tv.off();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tv.on();
    }
}
