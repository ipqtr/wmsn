package wmsn;

public class Main {
	public static Node[] roadSide = new Node[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (Node node : roadSide) {
			node = new Node(Node.ROADSIDE_NODE);
			}
		
		Plane plane = new Plane();
		//plane.insert("h", 0, 0);
		plane.draw();

		plane.show();
		
		//Count.printQueueNodesEnergy();
		
		
	}

}
