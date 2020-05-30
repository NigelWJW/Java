package state.Raffle;

/**
 * 状态模式测试类-抽奖活动
 * 状态模式：戴拿有很强的可读性，将每个状态的行为封装在对应的一个类中。而且方便维护，替代if else。符合开闭原则
 * 方便增删，但是可能状态过多会产生很多类，加大维护难度
 */
public class Client {
    public static void main(String[] args) {
        // 创建活动对象，奖品有1个奖品
        RaffleActivity activity = new RaffleActivity(1);
        // 我们连续抽300次奖
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.debuctMoney();
            // 第二步抽奖
            activity.raffle();
        }
    }
}
