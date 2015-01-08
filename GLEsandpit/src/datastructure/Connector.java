package datastructure;

public class Connector {
	
	public String getConnecingNode() {
		return ConnecingNode;
	}

	public void setConnecingNode(String connecingNode) {
		ConnecingNode = connecingNode;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}

	int Cost;
	String ConnecingNode;
	
	
}
