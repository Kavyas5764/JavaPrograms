package demo1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphones i = new Iphones();
		i.calls();
		i.calls();
		Lion l = new Lion();
		l.eat();
		l.makeSound();

	}

}

abstract class MotorBike{
	abstract void brake();
	
	public void Bike() {
		System.out.println("Bike runs on the road");
	}
}

abstract class Animal{
	abstract void makeSound();
	
	public void eat() {
		System.out.println("The Animals eats meats");
	}
}


abstract class Phones
{
	void calls()
	{
		System.out.println("call feature");
	}
	abstract void camera();
}

class Iphones extends Phones
{
	void camera() {
		System.out.println("edited camera feature:");
	}
}

class Lion extends Animal{
	void makeSound() {
		System.out.println("lion roars loudly");
	}
}
