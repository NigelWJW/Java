package observer.improve;

/**
 * �۲���ģʽ������֮����һ���������Լ��ϵķ�ʽ�����û������ӹ۲��߷��㣬�ͻ��˲��ñ仯
 * ��Observable�ࣺObservable�����þ���subject�൫�Ǽ����˽ӿں��࣬ʵ���˺��ĵķ�����
 */
public class Client {
	public static void main(String[] args) {
		//����һ��WeatherData
		WeatherData weatherData = new WeatherData();

		//���������۲���
		CurrentConditions currentConditions = new CurrentConditions();
		BaiduSite baiduSite = new BaiduSite();

		//�������۲���ע�ᵽweatherData
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(baiduSite);

		//����
		System.out.println("֪ͨ����ע��Ĺ۲���, ������Ϣ");
		weatherData.setData(10f, 100f, 30.3f);


		weatherData.removeObserver(currentConditions);
		//����
		System.out.println();
		System.out.println("֪ͨ����ע��Ĺ۲���, ������Ϣ");
		weatherData.setData(10f, 100f, 30.3f);
	}

}
