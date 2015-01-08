package datastructure;

public interface Graph {
	
	void addnode(String id);
	
	public void addnode(String id, String[] nextids);
	
	void deletenode(String id);

	Graph getnode(String id);
	
	
}
