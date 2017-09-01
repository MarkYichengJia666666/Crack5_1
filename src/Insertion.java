/**
 * Created by jiayicheng on 17/8/14.
 */
public class Insertion {
    int insertion(int n,int m,int i, int j)
    {
        int allOnes=~0;
        int left=allOnes<<(j+1);
        int right=(1<<i)-1;
        int mask=left|right;

        int shiftm=m<<i;
        int clear=mask&n;
        return clear|shiftm;
    }
}
