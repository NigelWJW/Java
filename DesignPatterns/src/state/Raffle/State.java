package state.Raffle;

/**
 * 状态抽象类
 */
public abstract class State {
    // 扣除积分方法 - 50
    public abstract void deductMoney();

    // 是否抽中奖品
    public abstract boolean raffle();

    // 是否发放奖品
    public abstract void dispensePrize();

}
