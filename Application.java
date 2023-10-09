/**
 * A class that implements various methods performed with a tree.
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch=new DepthFirstSearch();
		aSearch.DFS(root);
		
		//Test code for count() method
		System.out.println("The number of nodes traversed is: " + root.count());
		//Test code for getHeight()
		System.out.println("The height of the tree is: " + aTree.getHeight(root));
	}//end main

}//end class