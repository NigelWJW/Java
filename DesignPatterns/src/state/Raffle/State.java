package state.Raffle;

/**
 * ״̬������
 */
public abstract class State {
    // �۳����ַ��� - 50
    public abstract void deductMoney();

    // �Ƿ���н�Ʒ
    public abstract boolean raffle();

    // �Ƿ񷢷Ž�Ʒ
    public abstract void dispensePrize();

}
