package weatherInfo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThiGradeDTO {
	private String date; //SAWS_OBS_TM ��������
	private String stationName; //STN_NM ������
	private String thiGrade; //�������� ���
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		//builder.append(super.toString());
		builder.append("\n��¥ : ");
		builder.append(date + "\n");
		builder.append("������ : ");
		builder.append(stationName + "\n");
		builder.append("�������� ��� : ");
		builder.append(thiGrade + "\n");
		return builder.toString();
		
	}
}
