package Graph;

import java.util.Vector;

/**
 * 稠密图
 */
public class DenseGraph implements Graph{
    private int vertex; //顶点
    private int edges;//边数
    private boolean[][] matrix;
    private boolean directed ;
    public DenseGraph(int vertex,boolean directed){
        this.vertex=vertex;
        this.directed=directed;
        this.matrix=new boolean[vertex][vertex];
    }
    public int V(){
        return vertex;
    }
    public int E(){
        return edges;
    }



    public void addEdge(int v,int w){
        assert (v >=0 && v < edges);
        assert (w >=0 && w < edges);
        matrix[v][w] = true;
        if (!directed && v !=w){
            matrix[w][v] = true;
        }
        edges++;
    }
    public boolean hasEdge(int v,int w){
         return matrix[v][w];
    }
    public Iterable<Integer> adj(int v){
        assert v>=0&&v<vertex;
        Vector<Integer> adjV = new Vector<>();
        for (int i=0;i<vertex;i++){
            if (matrix[v][i]){
                adjV.add(i);
            }
        }
            return adjV;
    }
    public void show(){

        for( int i = 0 ; i < vertex ; i ++ ){
            for( int j = 0 ; j < vertex ; j ++ )
                System.out.print(matrix[i][j]+"\t");
            System.out.println();
        }
    }
}
