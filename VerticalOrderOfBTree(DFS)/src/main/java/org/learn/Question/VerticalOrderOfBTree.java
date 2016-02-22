
package org.learn.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerticalOrderOfBTree {
	private static Map<Integer, List<Integer>> mapVerticalDistance = null;

	private static void verticalOrder(Node root, int distance) {
		if (null == root)
			return;

		List<Integer> list = null;
		if (mapVerticalDistance.containsKey(distance)) {
			list = mapVerticalDistance.get(distance);
		} else {
			list = new ArrayList<Integer>();
		}
		
		list.add(root.data);
		mapVerticalDistance.put(distance, list);
		verticalOrder(root.left, distance - 1);
		verticalOrder(root.right, distance + 1);
	}

	public static void verticalOrderOfBTree(Node root) {
		if (null == mapVerticalDistance) {
			mapVerticalDistance = new HashMap<Integer, List<Integer>>();
		} else {
			mapVerticalDistance.clear();
		}
		verticalOrder(root, 0);
		mapVerticalDistance.forEach((k, v) -> System.out.println("Nodes at distance " + k + " = " + v));
	}
}
