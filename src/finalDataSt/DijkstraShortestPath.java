package finalDataSt;

public class DijkstraShortestPath {
	public static void main(String[] args) {
		int arr[][] = { { 0, 24, 5, 10, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 30, 10 }, { 0, 0, 0, 0, 0, 8 },
				{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 20, 0 } };
		System.out.println(Dijkstra(0, arr, 0));

	}

	static public int Dijkstra(int index, int array[][], int dist) {
		// An exception is raised if the array has only one value
		if (array.length == 1)
			throw new IllegalArgumentException("start point equal end point");
		// An exception is raised if the start or end point is outside the array
		else if (index >= array.length || dist >= array.length) {
			throw new IllegalArgumentException("Invalid start or end node");
		}

		else {

			boolean visited[] = new boolean[array.length];
			visited[index] = true;
			int shortestPath = 0;
			int oldIndex = index;

			for (int i = 0; i < array.length; i++) {
				index = minSearch(array[index], visited);
				visited[index] = true;
				// To update the value of the shortest path
				shortestPath = shortestPath + array[oldIndex][index];
				if (index == dist)
					return shortestPath;
				oldIndex = index;
			}
			// An exception is raised if no path is found between the starting point and the
			// end point
			if (visited[index] != true)
				throw new IllegalArgumentException("No path exists ");

			return shortestPath;
		}
	}

	static public int minSearch(int array[], boolean visited[]) {
		int min = Integer.MAX_VALUE;
		int nextRow = -1;
		// It searches for the lowest value to determine the next vertex
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0 & array[i] < min & visited[i] != true) {
				min = array[i];
				nextRow = i;
			}
		}

		return nextRow;
	}

}
