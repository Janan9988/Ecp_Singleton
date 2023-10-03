package Type_of_Singleton;
import Type_of_Singleton.Android;
import Type_of_Singleton.Windows;
import Type_of_Singleton.Operatingfactory;

public class FactoryMain {

	public static void main(String[] args) {
		Operatingfactory of = new Operatingfactory();
		Os obj = of.getInstance("Open");
		obj.spec();
	}

}
