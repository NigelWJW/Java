package command;

/**
 * ���������ɫ�ִ࣬�е�������⼴�ҾӵĿ��͹�
 */
//��������ӿ�
public interface Command {
    //ִ�ж���(����)
    public void execute();

    //��������(����)
    public void undo();
}
