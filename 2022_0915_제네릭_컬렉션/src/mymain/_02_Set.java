package mymain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class _02_Set {
	/*
		Set 인터페이스
		1.순서 없이 저장 되는 자료구조
		2.동일한 값은 중복저장 안된다
		3.들어가는 값은 순서없이 저장되나 꺼내서 쓸때 HashSet, TreeSet 등 순서 지정이 된다
	
	*/
	
	public static void main(String[] args) {
		//인터페이스        = new 클래스
		Set<Integer> numSet = new HashSet<Integer>();
		
		numSet.add(10);
		numSet.add(5);
		numSet.add(100);
		numSet.add(1);
		numSet.add(3);
		
		System.out.println(numSet);
		
		//데이터 저장을 오름차순 관리
		Set<Integer> lottoSet = new TreeSet<Integer>();
		Random random = new Random();
		
		int count = 6;
		while(count>0) {
			int su = random.nextInt(45) + 1; 		//1~45사이 난수 발생
			if(lottoSet.add(su)==false) continue;	//continue 써서 카운트 안빠지게 함
			
			count--;
		}
		System.out.println(lottoSet);
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//Set에 저장된 각각의 데이터 추출
		System.out.println("--[개선 loop이용]--");

		//for(자료형 변수 : 배열/Set/List/Map 가능)
		for(int su : lottoSet)
			System.out.printf("%3d",su);
		System.out.println();
		
		Integer n0b = 10; //받는쪽이 Integer 타입이라 int 타입이 원래는 대입이 안되지만~Auto-Boxing : new Intger(10) 생략
		int		n	= n0b;//받는쪽이 int 타입이라 Integer(객체)타입이 원래는 대입이 안되지만~Auto-Unboxing : n0b.intValue() 생략
		double	d	= n0b;
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		System.out.println("--[Iterator 방식]--");
		//Iterator : 반복자
		Iterator<Integer> it = lottoSet.iterator();
		while(it.hasNext()){		//it.hasNext() 가져올 요소(Element)가 있는지 체크
			int su = it.next(); 	//it.next() 값을 가져온 수 다음으로 이동
			System.out.printf("%3d", su);
		}
		System.out.println();
		
		
		
	}

}
