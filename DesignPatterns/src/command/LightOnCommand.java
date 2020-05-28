package command;

/**
 * ����������-�������ߺͶ�������һ�𣬵��ý�������Ӧ����ʵ������ִ��
 */
public class LightOnCommand implements Command {
    //�ۺ�LightReceiver
    LightReceiver light;

    //�����������ƽ����߾ۺϽ���
    public LightOnCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        //���õƽ����ߵķ���
        light.on();
    }

    @Override
    public void undo() {
        //���õƽ����ߵķ���
        light.off();
    }

}
