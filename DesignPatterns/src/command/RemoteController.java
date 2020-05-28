package command;

/**
 * ����������༴Invoker��
 */
public class RemoteController {
	// ���ذ�ť����������
	Command[] onCommands;
	Command[] offCommands;
	// ִ�г���������-��¼��ǰ�Ŀ������
	Command undoCommand;

	// ����������ɶ԰�ť��ʼ��
	public RemoteController() {
		onCommands = new Command[5];
		offCommands = new Command[5];
		for (int i = 0; i < 5; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
	}

	// �����ǵİ�ť��������Ҫ������
	public void setCommand(int no, Command onCommand, Command offCommand) {
		onCommands[no] = onCommand;
		offCommands[no] = offCommand;
	}

	// ���¿���ť
	public void onButtonWasPushed(int no) { // no 0
		// �ҵ��㰴�µĿ��İ�ť�� �����ð󶨵Ķ�Ӧ����
		onCommands[no].execute();
		// ��¼��εĲ��������ڳ���
		undoCommand = onCommands[no];
	}

	// ���¹ذ�ť
	public void offButtonWasPushed(int no) { // no 0
		// �ҵ��㰴�µĹصİ�ť�� �����ð󶨵Ķ�Ӧ����
		offCommands[no].execute();
		// ��¼��εĲ��������ڳ���
		undoCommand = offCommands[no];
	}

	// ���³�����ť
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
}
