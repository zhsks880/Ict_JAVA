package mymain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class _02_Set {
	/*
		Set �������̽�
		1.���� ���� ���� �Ǵ� �ڷᱸ��
		2.������ ���� �ߺ����� �ȵȴ�
		3.���� ���� �������� ����ǳ� ������ ���� HashSet, TreeSet �� ���� ������ �ȴ�
	
	*/
	
	public static void main(String[] args) {
		//�������̽�        = new Ŭ����
		Set<Integer> numSet = new HashSet<Integer>();
		
		numSet.add(10);
		numSet.add(5);
		numSet.add(100);
		numSet.add(1);
		numSet.add(3);
		
		System.out.println(numSet);
		
		//������ ������ �������� ����
		Set<Integer> lottoSet = new TreeSet<Integer>();
		Random random = new Random();
		
		int count = 6;
		while(count>0) {
			int su = random.nextInt(45) + 1; 		//1~45���� ���� �߻�
			if(lottoSet.add(su)==false) continue;	//continue �Ἥ ī��Ʈ �Ⱥ����� ��
			
			count--;
		}
		System.out.println(lottoSet);
//�����������������������������������������������������
		//Set�� ����� ������ ������ ����
		System.out.println("--[���� loop�̿�]--");

		//for(�ڷ��� ���� : �迭/Set/List/Map ����)
		for(int su : lottoSet)
			System.out.printf("%3d",su);
		System.out.println();
		
		Integer n0b = 10; //�޴����� Integer Ÿ���̶� int Ÿ���� ������ ������ �ȵ�����~Auto-Boxing : new Intger(10) ����
		int		n	= n0b;//�޴����� int Ÿ���̶� Integer(��ü)Ÿ���� ������ ������ �ȵ�����~Auto-Unboxing : n0b.intValue() ����
		double	d	= n0b;
//�����������������������������������������������������
		System.out.println("--[Iterator ���]--");
		//Iterator : �ݺ���
		Iterator<Integer> it = lottoSet.iterator();
		while(it.hasNext()){		//it.hasNext() ������ ���(Element)�� �ִ��� üũ
			int su = it.next(); 	//it.next() ���� ������ �� �������� �̵�
			System.out.printf("%3d", su);
		}
		System.out.println();
		
		
		
	}

}
