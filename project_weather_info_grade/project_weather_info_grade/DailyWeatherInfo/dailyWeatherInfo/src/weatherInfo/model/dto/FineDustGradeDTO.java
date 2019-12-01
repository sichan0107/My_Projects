package weatherInfo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FineDustGradeDTO {
	private String msrdt_de;
	private String msrste_nm;
	private String grade;
	private String superGrade;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		//builder.append(super.toString());
		builder.append("\n��¥ : ");
		builder.append(msrdt_de + "\n");
		builder.append("������ : ");
		builder.append(msrste_nm + "\n");
		builder.append("�̼����� ��� : ");
		builder.append(grade + "\n");
		builder.append("�� �̼����� ��� : ");
		builder.append(superGrade + "\n");
		return builder.toString();
		
	}
}
