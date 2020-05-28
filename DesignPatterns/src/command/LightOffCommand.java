package command;

/**
 * ����������-�������ߺͶ�������һ�𣬵��ý�������Ӧ����ʵ������ִ��
 */
public class LightOffCommand implements Command {
    // �ۺ�LightReceiver
    LightReceiver light;

    // ������
    public LightOffCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        // ���ý����ߵķ���
        light.off();
    }

    @Override
    public void undo() {
        // ���ý����ߵķ���
        light.on();
    }
}
