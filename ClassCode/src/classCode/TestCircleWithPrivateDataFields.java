package classCode;

public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleWithPrivateDataFields myCircle = 
				new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
	
		System.out.println("The number of objects created is "
				+ CircleWithPrivateDataFields.getNumberOfObjects());
	
	}

}
