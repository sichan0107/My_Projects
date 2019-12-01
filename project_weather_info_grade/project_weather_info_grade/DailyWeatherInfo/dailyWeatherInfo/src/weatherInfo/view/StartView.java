
package weatherInfo.view;

import weatherInfo.service.AirWeatherInfoController;

public class StartView {
	public static AirWeatherInfoController controller = AirWeatherInfoController.getInstance();
	
	public static void main(String [] args) {
		
		// -------------------------- Start weather service ----------------------
//		System.out.println("***** ��� �������  ��ȸ *****");
//		controller.getAllDayWeatherInfo();
					
		System.out.println("***** ���ں� �������  ��ȸ *****");
		controller.getDayWeatherInfo("20190501", "����");

		// -------------------------- Start air pollution service ----------------------
//		System.out.println("***** ��� ���������� ���� ��ȸ *****");
//		controller.getAllDayAirPollution();
		
		System.out.println("***** ���ں� ���������� ����  ��ȸ *****");
		controller.getDayAirPollution("20190710", "���ʱ�");
		
		// -------------------------- Start grade service ----------------------
		System.out.println("***** ���ں� & ������ �̼����� ��� ��ȸ *****");
		controller.getFineDustGrade("20190601", "��������");
		
		System.out.println("***** ���ں� & ������ �������� ��� ��ȸ *****");
		controller.getThiGrade("20190501", "����");
	}
		
}
