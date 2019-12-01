package weatherInfo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DayWeatherDTO {
	private String date; //SAWS_OBS_TM ��������
	private String stationName; //STN_NM ������
	private double avgTemperature; //SAWS_TA_AVG  
	private double minTemperature; //SAWS_TA_MIN
	private double maxTemperature; //SAWS_TA_MAX
	private double avgHumid; //SAWS_HD_AVG
	private double minHumid; //SAWS_HD_MIN
	private double maxHumid; //SAWS_HD_MAX
	private double avgWindSpeed; //SAWS_WS_AVG
	private double maxWindSpeed; //SAWS_WS_MAX
	private double sumRain; //SAWS_RN_SUM ������
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		//builder.append(super.toString());
		builder.append("\n�������� : ");
		builder.append(date + "\n");
		builder.append("������ : ");
		builder.append(stationName + "\n");
		builder.append("��ձ�� : ");
		builder.append(avgTemperature + "\n");
		builder.append("������� : ");
		builder.append(minTemperature + "\n");
		builder.append("�ִ��� : ");
		builder.append(maxTemperature + "\n");
		builder.append("��ս��� : ");
		builder.append(avgHumid + "\n");
		builder.append("�������� : ");
		builder.append(minHumid + "\n");
		builder.append("�ְ���� : ");
		builder.append(maxHumid + "\n");	
		builder.append("���ǳ�� : ");
		builder.append(avgWindSpeed + "\n");
		builder.append("�ִ�ǳ�� : ");
		builder.append(maxWindSpeed + "\n");
		builder.append("������ : ");
		builder.append(sumRain + "\n");
		return builder.toString();
		
	}
}
