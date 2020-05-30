package state.Money;

/**
 * ״̬�ӿ�
 */
public interface State {
    /**
     * ����
     */
    void checkEvent(Context context);

    /**
     * ����ʧ��
     */
    void checkFailEvent(Context context);

    /**
     * ���۷���
     */
    void makePriceEvent(Context context);

    /**
     * �ӵ�
     */
    void acceptOrderEvent(Context context);

    /**
     * ���˽ӵ�ʧЧ
     */
    void notPeopleAcceptEvent(Context context);

    /**
     * ����
     */
    void payOrderEvent(Context context);

    /**
     * �ӵ�����֧��ʧЧ
     */
    void orderFailureEvent(Context context);

    /**
     * ����
     */
    void feedBackEvent(Context context);

    //��õ�ǰ״̬
    String getCurrentState();
}
