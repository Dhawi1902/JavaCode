package chapter13;

	public class TestGeometricObject {
		/** Main method */
		public static void main(String[] args) {
			// Declare and initialize two geometric objects
			GeometricObject geoObjectl = new Circle(5);
			GeometricObject geoObject2 = new Rectangle(5, 3);

			System.out.println("The two objects have the same area? " +
					equalArea(geoObjectl, geoObject2));

			// Display circle
			displayGeometricObject(geoObjectl);

			// Display rectangle
			displayGeometricObject(geoObject2);
		}

		/** A method for comparing the areas of two geometric objects */
		public static boolean equalArea(GeometricObject objectl,
				GeometricObject object2) {
			return objectl.getArea() == object2.getArea();
		}
		
		/** A method for displaying a geometric object */
		public static void displayGeometricObject(GeometricObject object) {
			System.out.println();
			System.out.println("The area is " + object.getArea());
			System.out.println("The perimeter is " + object.getPerimeter());
		}
}