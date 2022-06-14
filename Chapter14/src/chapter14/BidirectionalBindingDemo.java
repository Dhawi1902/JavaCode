package chapter14;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class BidirectionalBindingDemo {
	public static void main(String[] args) {
		DoubleProperty dl = new SimpleDoubleProperty(1l);
		DoubleProperty d2 = new SimpleDoubleProperty(2);
		dl.bindBidirectional(d2);
		System.out.println("dl is " + dl.getValue()
			+ " and d2 is " + d2.getValue());
		dl.setValue(50.1);
		System.out.println("dl is " + dl.getValue()
			+ " and d2 is " + d2.getValue());
		d2.setValue(70.2);
		System.out.println("dl is " + dl.getValue()
			+ " and d2 is " + d2.getValue());

	}
}