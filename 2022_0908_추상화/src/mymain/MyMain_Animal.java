package mymain;

import myutil.Animal;
import myutil.Cat;
import myutil.Dog;
import myutil.Pig;

public class MyMain_Animal {

	static void ¢���(Animal [] animal_array) {
		
		for(Animal ani: animal_array ) {
			ani.crying();
		}	
	}
	
	static void �Ծ��(Animal [] animal_array) {
			
			for(Animal ani: animal_array ) {
				ani.eating();
			}	
		}

	public static void main(String[] args) {
		
		Animal [] animal_array = {new Cat(), new Dog(), new Pig()};
		¢���(animal_array);
		
	}
}
