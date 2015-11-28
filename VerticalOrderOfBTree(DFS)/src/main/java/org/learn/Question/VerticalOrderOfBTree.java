
package org.learn.Question;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.learn.PrepareTree.Node;

public class VerticalOrderOfBTree {	
	Map<Integer, List<Integer>> map = null;
	private void verticalOrder(Node root,int distance) {
		if(null == root)
			return;
		
		List<Integer> list = null;
		if(map.containsKey(distance)) {
			list = map.get(distance);
		} else {
			list = new ArrayList<Integer>();			
		}		
		list.add(root.data);
		map.put(distance, list);
		verticalOrder(root.left,distance - 1);
		verticalOrder(root.right,distance + 1);			
	}
	public void verticalOrderOfBTree(Node root) {
		if(null == map) {
			map = new HashMap<Integer, List<Integer>>();
		} else {
			map.clear();		
		}
		verticalOrder(root,0);
		map.forEach((k, v) -> 
				System.out.println("Nodes at distance " + k + " = " + v));		
	}	
}
