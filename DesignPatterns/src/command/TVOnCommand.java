package command;

/**
 * ����������-�������ߺͶ�������һ�𣬵��ý�������Ӧ����ʵ������ִ��
 */
public class TVOnCommand implements Command {
    // �ۺ�TVReceiver
    TVReceiver tv;

    // ������
    public TVOnCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        // ���ý����ߵķ���
        tv.on();
    }

    @Override
    public void undo() {
        // ���ý����ߵķ���
        tv.off();
    }
}
