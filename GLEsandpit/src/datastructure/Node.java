package datastructure;

import java.util.ArrayList;
import java.util.Arrays;

public class Node {

	ArrayList<Integer> connecter;
	String value;
	
	public Node(Integer[] connecters)
	{
		connecter = new ArrayList<Integer>(Arrays.asList(connecters));
		value = new String();
	}
	
	public Node()
	{
		connecter = new ArrayList<Integer>();
		value = new String();
	}
	
	public ArrayList<Integer> getConnecter() {
		return connecter;
	}
	
	public void setConnecter(ArrayList<Integer> connecter) {
		this.connecter = connecter;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

}
