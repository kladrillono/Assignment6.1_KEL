/*
 * This class implements a depth first search of type preorder.
 * @author Kendall E. Ladrillono
 */
public class DepthFirstSearch {
	
	Node root;
	
	/*Constructor for DepthFirstSearch. */
	public DepthFirstSearch() 
	{
		System.out.println("Call DFS with root node to do a Depth First Search.");
	}//end constructor
	
	/* Method to traverse tree.
	 * @param node
	 */
	public void DFS(Node node)
	{
		if (node == null) {
			return;
		}
		System.out.println(node.getData());
		DFS(node.getlChild());
		DFS(node.getrChild());
		
	}//end DFS

}// end class
