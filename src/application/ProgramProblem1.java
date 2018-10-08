package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class ProgramProblem1 {

	public static void main(String[] args) {
		List<Shape> myShp = new ArrayList<>();
		myShp.add(new Circle(2.0));
		myShp.add(new Rectangle(3.0, 2.0));

		List<Circle> myCircle = new ArrayList<>();
		myCircle.add(new Circle(2.0));
		myCircle.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myShp));
		System.out.println("Total Circle area: " + totalArea(myCircle));
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
