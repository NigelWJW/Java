package memento.game;

/**
 * 备忘本模式-给用户提供一种可以恢复状态的机制，可以方便回到某状态，实现信息封装，但是类成员变量
 * 过多会导致较大资源，适合后悔药，游戏存档，ctrl+z
 */
public class Client {
	public static void main(String[] args) {
		//创建游戏角色
		GameRole gameRole = new GameRole();
		gameRole.setVit(100);
		gameRole.setDef(100);
		System.out.println("和boss大战前的状态");
		gameRole.display();
		//把当前状态保存caretaker
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(gameRole.createMemento());
		System.out.println("和boss大战~~~");
		gameRole.setDef(30);
		gameRole.setVit(30);
		gameRole.display();
		System.out.println("大战后，使用备忘录对象恢复到站前");
		gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
		System.out.println("恢复后的状态");
		gameRole.display();
	}
}
