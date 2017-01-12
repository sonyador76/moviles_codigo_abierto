package gitText;

public class Clasificador {
	public static void sort(Comparable[] list) {

	}

	public static Object getMinimum(Comparable[] list) throws ComparationException {
		int min = 0;

		// Comparable min=list[0];
		for (int i = 1; i < list.length; i++) {
			if ((list[min].comparableTo(list[i])) > 0)
				min = i;
		}
		return null;
	}
}
