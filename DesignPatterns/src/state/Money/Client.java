package state.Money;

/**
 * ������
 */
public class Client {
	public static void main(String[] args) {
		//����context ����
		Context context = new Context();
		//����ǰ״̬����Ϊ PublishState
		context.setState(new PublishState());
		System.out.println(context.getCurrentState());

//        //publish --> not pay
		context.acceptOrderEvent(context);
//        //not pay --> paid
		context.payOrderEvent(context);
//        // ʧ��, ���ʧ��ʱ�����׳��쳣
//        try {
//        	context.checkFailEvent(context);
//        	System.out.println("��������..");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

	}

}
