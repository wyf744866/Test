package testforday3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wyf
 * @create 2020/6/16
 */
public class Test297 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            return reSerialize(root, "");
        }
        public String reSerialize(TreeNode root, String str) {
            if (root == null) {
                str += "None,";
            } else {
                str += str.valueOf(root.val) + ",";
                str = reSerialize(root.left, str);
                str = reSerialize(root.right, str);
            }
            return str;
        }
        public TreeNode rdeserialize(List<String> l) {
            if (l.get(0).equals("None")) {
                l.remove(0);
                return null;
            }

            TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
            l.remove(0);
            root.left = rdeserialize(l);
            root.right = rdeserialize(l);

            return root;
        }


        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] data_array = data.split(",");
            List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
            return rdeserialize(data_list);

        }
    }
}
