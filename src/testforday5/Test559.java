package testforday5;

import java.util.List;

/**
 * @author wyf
 * @create 2020/7/28
 */
public class Test559 {
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


    class Solution {
        public int maxDepth(Node root) {
            if (root == null) {
                return 0;
            }
            List<Node> child = root.children;
            int result = 0;
            for (Node node : child) {
                result = Math.max(result,maxDepth(node)+1);
            }
            return result+1;
        }
    }
}
