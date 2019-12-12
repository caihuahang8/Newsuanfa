package UnionFind;

public class UnionFind2 {
    private int[] parent;
    private int count;
    public UnionFind2(int n){
        count=n;
        for (int i=0;i<count;i++){
            parent[i] =i;
        }
    }
    public int find(int p){
        assert p>=0&&p<=count;
        while (p!=parent[p]){
            p = parent[p];
        }
        return p;
    }
    public boolean unimElments(int p,int q){
        return parent[p] == parent[q];
    }
    public void Union(int p,int q){
        int pId = find(p);
        int qId = find(q);
        if (qId == pId){
            return;
        }
        parent[pId] = qId;

    }
}
