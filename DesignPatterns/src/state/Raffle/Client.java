package state.Raffle;

/**
 * ״̬ģʽ������-�齱�
 * ״̬ģʽ�������к�ǿ�Ŀɶ��ԣ���ÿ��״̬����Ϊ��װ�ڶ�Ӧ��һ�����С����ҷ���ά�������if else�����Ͽ���ԭ��
 * ������ɾ�����ǿ���״̬���������ܶ��࣬�Ӵ�ά���Ѷ�
 */
public class Client {
    public static void main(String[] args) {
        // ��������󣬽�Ʒ��1����Ʒ
        RaffleActivity activity = new RaffleActivity(1);
        // ����������300�ν�
        for (int i = 0; i < 30; i++) {
            System.out.println("--------��" + (i + 1) + "�γ齱----------");
            // �μӳ齱����һ������۳�����
            activity.debuctMoney();
            // �ڶ����齱
            activity.raffle();
        }
    }
}
