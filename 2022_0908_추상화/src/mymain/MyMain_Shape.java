package mymain;

import myutil.Circle;
import myutil.Nemo;
import myutil.Shape;
import myutil.Triangle;

public class MyMain_Shape {
	
	/*�̰͵� ������ �ϳ�
	 * static void �׷���(Shape[] draw_array) { 
	 * for(Shape dr: draw_array) 
	 * { dr.drawing(); } }
	 */
	public static void main(String[] args) {

		Shape [] draw_array = {new Triangle(), new Nemo(), new Circle()};
			for (Shape shape : draw_array)
				shape.drawing();
	}
}
