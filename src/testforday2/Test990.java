package testforday2;

/**
 * @author wyf
 * @create 2020/6/8
 */
public class Test990 {
    //并查集
    public boolean equationsPossible(String[] equations) {
        int length = equations.length;
        int[] parent = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
        for (String str : equations) {
            if (str.charAt(1) == '=') {
                int index1 = str.charAt(0) - 'a';
                int index2 = str.charAt(3) - 'a';
                union(parent, index1, index2);
            }
        }
        for (String str : equations) {
            if (str.charAt(1) == '!') {
                int index1 = str.charAt(0) - 'a';
                int index2 = str.charAt(3) - 'a';
                if (find(parent, index1) == find(parent, index2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
    }


    /* ## 并查集
      传递性
     「合并」与「查询」两个变量是否同在一个联通分量。～O(1)
      ## 并查集优化
       路径压缩
       隔代压缩 （this.parent = this.parent.parent）
       完全压缩 (this.parent = root)
       按秩合并 (树高度低的根结点，指向高的根结点）*/
    /*找到根节点，完全压缩*/
    public int find(int[] parent, int index) {
        while (parent[index] != index) {
            parent[index] = parent[parent[index]];
            index = parent[index];
        }
        return index;
    }


}
