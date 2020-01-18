package easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthOfNAaryTree {
	public int maxDepth(Node root) {
		Queue< Node> queue = new LinkedList<Node>();
		if(root == null) {
			return 0 ; 
		}
		int height  = 0 ;
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			height++;
			while(size-->0) {
				List<Node> children = queue.poll().children;
				for(Node node : children) {
					queue.add(node);
				}
			}
		}
		
		return height ; 
	}

}

class Node {
	public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
