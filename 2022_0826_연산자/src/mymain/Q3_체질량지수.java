package mymain;

import java.util.Scanner;

public class Q3_ü�������� {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//����
		double height;  //Ű
		double weight;  //������
		double bmi;     //body mass index = ������/Ű*Ű(m)
		String body_info="";
		
		System.out.printf("Ű/������:");
		height = scanner.nextDouble();
		weight = scanner.nextDouble();
		double height_m = height / 100.0;  // cm->m ��ȯ
		
		//1.bmi���
		//bmi = weight / ((0.01*height) * (0.01*height));
		bmi = weight / (height_m * height_m);
		
		if(bmi<18.5) 
			body_info="��ü��";
		else if(bmi>=18.5 && bmi<=22.9) // else if �� �ȿ��� ������ �Ѱ��� {} <�ְ� �ʿ���� 
			body_info="����";
		else if(bmi>=23 && bmi<=25.0)
			body_info="��ü��";
		else if(bmi>=25 && bmi<=29.9)
			body_info="1�ܰ� ��";
		else if(bmi>=30 && bmi<=34.9) 
			body_info="2�ܰ� ��";
		else if(bmi>35) 
			body_info="����";
			
		System.out.printf("����� bmi�� [%.1f] �̸�, �񸸵������ [%s] �Դϴ�.\n", bmi, body_info);
		
		scanner.close();
	}

}
