package Graph;

import java.util.Stack;
import java.util.Vector;

public class Path {

    Graph G;
    private boolean[] visited;
    private int[] form;
    private int s;
    //图的深度优先遍历
    void dfs(int v){
        visited[v] = true;
        for (int i : G.adj(v)){
            if (!visited[i]){
                dfs(i);
                form[i] = v;
            }
        }
    }
    public Path(Graph graph,int s){
        G=graph;
        form = new int[G.V()];
        for (int i=0;i<G.V();i++){
            visited[i] = false;
            form[i]=-1;
        }
        this.s=s;
        dfs(s);
    }
    public boolean hasPath(int v){
        return visited[v];
    }

    Vector<Integer> path(int w){
        Stack<Integer> stack = new Stack<>();
        //向里面加东西
        int p = form[w];
        while (p != -1){
            stack.add(p);
            p = form[p];
        }
        Vector<Integer> res = new Vector<>();
        while (res.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }
}
