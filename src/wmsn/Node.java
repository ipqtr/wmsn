package wmsn;

public class Node {
public int id;
public Information info;
public static final int CAR_NODE = 300; // indicates the node type & Range of communication
public static final int SINK_NODE = 500;
public static final int ROADSIDE_NODE = 140;
public static final int ROADSIDE_NODE_COVERAGE = 141;
public int type = 1;
public int range;

public Node(int type)
{
	this.type = type; 
}

}
