package Graph;

public class Components {
    Graph G;
    private boolean[] visited;
    private int ccount;
    private int[] id;
    //图的深度优先遍历
    void dfs(int v){
        visited[v] = true;
        id[v] = ccount;
        for (int i : G.adj(v)){
            if (!visited[i]){
                dfs(i);
            }
        }
    }
    public Components(Graph graph){
        G=graph;
        id = new int[G.V()];
        for (int i=0;i<G.V();i++){
            visited[i] = false;
            id[i]=-1;
        }
        ccount=0;
        for (int i=0;i<G.V();i++){
            if (!visited[i]){
                dfs(i);
                ccount++;
            }
        }
    }


}
