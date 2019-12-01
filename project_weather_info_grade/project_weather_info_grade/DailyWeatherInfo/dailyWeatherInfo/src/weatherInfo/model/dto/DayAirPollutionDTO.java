package weatherInfo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DayAirPollutionDTO {
	/*
����	��¸�		��¼���
1 	MSRDT_DE 	�����Ͻ� 
2 	MSRSTE_NM 	�����Ҹ� 
3 	NO2 		�̻�ȭ���ҳ�(ppm) 
4 	O3 			������(ppm) 
5 	CO 			�ϻ�ȭź�ҳ�(ppm) 
6 	SO2 		��Ȳ�갡��(ppm) 
7 	PM10 		�̼�����(��/��) 
8 	PM25 		�ʹ̼�����(��/��) 
	 */
	private String msrdt_de;
	private String msrste_nm;
	private double no2;
	private double o3;
	private double co;
	private double so2;
	private double pm10;
	private double pm25;
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. �����Ͻ� : ");
		builder.append(msrdt_de + "\n");
		builder.append("2. �����Ҹ� : ");
		builder.append(msrste_nm + "\n");
		builder.append("3. �̻�ȭ���ҳ�(ppm) : ");
		builder.append(no2 + "\n");
		builder.append("4. ������(ppm) : ");
		builder.append(o3 + "\n");
		builder.append("5. �ϻ�ȭź�ҳ�(ppm) : ");
		builder.append(co + "\n");
		builder.append("6. ��Ȳ�갡��(ppm) : ");
		builder.append(so2 + "\n");
		builder.append("7. �̼�����(��/��) : ");
		builder.append(pm10 + "\n");
		builder.append("8. �ʹ̼�����(��/��): ");
		builder.append(pm25 + "\n");
		return builder.toString();
	}
	
}
