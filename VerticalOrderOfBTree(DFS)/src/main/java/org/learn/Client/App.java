package org.learn.Client;

import org.learn.PrepareTree.Node;
import org.learn.Question.VerticalOrderOfBTree;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {		
    	Node root = Node.createNode(100);
    	root.left        = Node.createNode(50);
    	root.right       = Node.createNode(150);
    	//left sub tree
    	root.left.left  = Node.createNode(25);
    	root.left.right = Node.createNode(80);
    	root.left.right.right = Node.createNode(90);
    	
    	//right subtree
    	root.right.left  = Node.createNode(125);
    	root.right.right = Node.createNode(200);   
    	
    	VerticalOrderOfBTree objVerticalOrder = new VerticalOrderOfBTree();
    	objVerticalOrder.verticalOrderOfBTree(root);  	
    }
}
