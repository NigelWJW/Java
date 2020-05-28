package command;

/**
 * 抽象命令角色类，执行的命令都在这即家居的开和关
 */
//创建命令接口
public interface Command {
    //执行动作(操作)
    public void execute();

    //撤销动作(操作)
    public void undo();
}
