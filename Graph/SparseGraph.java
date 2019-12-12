package Graph;

import java.util.Vector;

public class SparseGraph implements Graph {
    private int n;//结点
    private int m;//边数
    private Vector<Integer>[] g;
    private boolean directed;
    public SparseGraph(int n,boolean directed){
        this.n = n;
        this.directed=directed;
        this.m=  0;
        g = (Vector<Integer>[]) new Vector[n];
        for (int i =0;i<n;i++){
            g[i] = new Vector<Integer>();
        }
    }

    @Override
    public int V() {
        return n;
    }

    @Override
    public int E() {
        return m;
    }

    public void addEdge(int v, int w){
        g[v].add(w);
        if (!directed && v!=w){
            g[w].add(v);
        }
        m++;
    }

    @Override
    public void show() {

    }

    public boolean hasEdge(int v ,int w){
        assert (v >=0 && v<n);
        assert (w >=0 && w<n);
        for (int i =0 ; i<g[v].size();i++){
            if (g[v].elementAt(i) == w){
                return true;
            }
        }
        return false;
    }
    public Iterable<Integer> adj(int v){
        assert v>=0&&v<n;
        return g[v];
    }
}
