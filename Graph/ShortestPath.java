package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class ShortestPath {

    private Graph G;   // 图的引用
    private int s;     // 起始点
    private boolean[] visited;  // 记录dfs的过程中节点是否被访问
    private int[] from;         // 记录路径, from[i]表示查找的路径上i的上一个节点
    private int[] ord;          // 记录路径中节点的次序。ord[i]表示i节点在路径中的次序。

    public ShortestPath(Graph graph,int s){
        G = graph;
        this.visited=new boolean[G.V()];
        for (int i =0;i<G.V();i++){
            visited[i]=false;
            from[i]=-1;
            ord[i]=-1;
        }
        this.s=s;
        /**
         * 广度优先遍历
         */
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s]=true;
        ord[s]=0;

        while (!queue.isEmpty()){
            int p = queue.remove();
            for (int v:G.adj(p)){
                if (!visited[v]){
                    queue.add(v);
                    visited[v]=true;
                    from[v]=p;
                    ord[v]=ord[p]+1;
                }
            }
        }
    }

    /**
     * 判断是否有路
     */
    public boolean hasPath(int v){
        return visited[v];
    }
    /**
     * 两个地方的路径;s到w是否有路径可以到
     */
    public Vector<Integer> Path(int w){
        assert hasPath(w);

        Stack<Integer> stack = new Stack<>();
        int p = from[w];
        while (p!=-1){
            stack.push(p);
            p = from[p];
        }
        Vector<Integer> vector = new Vector<>();
        while (!stack.isEmpty()){
            vector.add(stack.pop());
        }
        return vector;
    }
}
