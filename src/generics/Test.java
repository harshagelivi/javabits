package generics;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class Test {

	public static void main(String[] args) {
		
		// <> - diamond operator - type inference
		// compiler knows type of ArrayList from variable type 
		List<Integer> types = new ArrayList<>();
		
		List<Animal> animals = new ArrayList<>();
		List<Dog> dogs = new ArrayList<>();
		List<Cat> cats = new ArrayList<>();
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		animals.add(animal);
		animals.add(dog);
		animals.add(cat);
		
		//animals = dogs;	//error: type mismatch
		
		print(animals);
		//print(dogs);		//error: type mismatch
		
		
		
		

	}

	public static void print1(List<?> list) {
		
	}
	
	public static void print2(List<? extends Animal> list) {
		
	}
	
	public static void print3(List<? super Animal> list) {
		
	}
	
	public static void print(List<Animal> animals) {
		
	}
	
	public static <T, E> String giveT(T t, E e) {
		
		return (String)t;
	}
}
