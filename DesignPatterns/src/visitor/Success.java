package visitor;

/**
 * �����������
 */
public class Success extends Action {
	@Override
	public void getManResult(Man man) {
		System.out.println(" ���˸������۸ø��ֺܳɹ� !");
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println(" Ů�˸������۸ø��ֺܳɹ� !");
	}

}
