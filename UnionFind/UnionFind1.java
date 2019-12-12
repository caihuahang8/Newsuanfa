package UnionFind;

public class UnionFind1 {
    private int count;
    private int[] id;
    public UnionFind1(int n ){
        count = n;
        for (int i = 0 ; i<count; i++){
            id[i] = i;
        }
    }
    //查找
    public int find(int p){
        assert p >=0 && p <= count;
        return id[p];
    }
    //查看有没有连接
    public boolean unimElments(int p,int q){
        if (id[p] == id[q]){
            return true;
        }
        return false;
    }
    //合并
    public void Union(int p,int q){
        int pId = find(p);
        int qId = find(q);
        if (qId == pId){
            return;
        }

        for (int i = 0 ;i < count;i++){
            if (id[i] ==pId){
                id[i] = qId;
            }
        }
    }
}
