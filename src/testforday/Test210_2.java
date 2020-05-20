package testforday;

import java.util.Stack;

/**
 * @author wyf
 * @date 2020/5/17 - 13:37
 */
public class Test210_2 {
    // 方法 2：邻接矩阵 + DFS   由于用的数组，每次都要遍历，效率比较低
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return new int[0];
        // 建立邻接矩阵
        int[][] graph = new int[numCourses][numCourses];
        for (int[] p : prerequisites) {
            graph[p[1]][p[0]] = 1;
        }
        // 记录访问状态的数组，访问过了标记 -1，正在访问标记 1，还未访问标记 0
        int[] status = new int[numCourses];
        Stack<Integer> stack = new Stack<>();  // 用栈保存访问序列
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(graph, status, i, stack)) return new int[0]; // 只要存在环就返回
        }
        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            res[i] = stack.pop();
        }
        return res;
    }

    private boolean dfs(int[][] graph, int[] status, int i, Stack<Integer> stack) {
        if (status[i] == 1) return false; // 当前节点在此次 dfs 中正在访问，说明存在环
        if (status[i] == -1) return true;

        status[i] = 1;
        for (int j = 0; j < graph.length; j++) {
            // dfs 访问当前课程的后续课程，看是否存在环
            if (graph[i][j] == 1 && !dfs(graph, status, j, stack)) return false;
        }
        status[i] = -1;  // 标记为已访问
        stack.push(i);
        return true;
    }

}
