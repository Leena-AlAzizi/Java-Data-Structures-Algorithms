package finalDataSt;

public class PriorityQueueManager {

	Node front;
	Node rear;
	Node counter;
	boolean i;

	private class Node {

		String data;
		int priority;
		Node nextAddress;
	}

	void insert(int priority, String data) {
		//We created a node
		Node newNode = new Node();

		newNode.data = data;
		newNode.priority = priority;
		counter = front;
		i = false;

		//Check if front is empty
		if (front == null) {
			front = newNode;
			rear = newNode;
		} else if (newNode.priority < front.priority) { //We check if the priority of the new node is lower than front
			newNode.nextAddress = front;
			front = newNode;
			counter = newNode;

		} else if (rear.priority < newNode.priority) { //We check if the priority of the new node is greater than rear
			rear.nextAddress = newNode;
			rear = newNode;
		} else {
			while (i == false) { //If it is not any of the previous cases, he continues to search for it until he finds the appropriate location for it in the queue
				if (newNode.priority < counter.nextAddress.priority) {
					newNode.nextAddress = counter.nextAddress;
					counter.nextAddress = newNode;
					i = true;
				}
				counter = counter.nextAddress;
			}
		}
	}

	String getMin() {
		return front.data;
	}

	void removeMin() {

		if (front == rear) {
			front = rear = null;

		} else {//The old front is stored with a temporary node
			Node temporary = new Node();
			temporary = front;

			//The new front is stored in front
			front = front.nextAddress;
			temporary = null;
		}
	}

}
