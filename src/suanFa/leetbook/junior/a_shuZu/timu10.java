package suanFa.leetbook.junior.a_shuZu;
/*
* 旋转图像
* 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
*/
public class timu10 {

    /*
    * i,i+k   i+k,j   j,j-k   j-k,i
    * */
    public void rotate(int[][] matrix) {
        int len=matrix.length;
        for(int i=0;i<len/2;i++){
            int j=len-i-1;
            for(int k=0;k<j-i;k++){
                int temp=matrix[i][i+k];
                matrix[i][i+k]=matrix[j-k][i];
                matrix[j-k][i]=matrix[j][j-k];
                matrix[j][j-k]=matrix[i+k][j];
                matrix[i+k][j]=temp;
            }
        }
    }

    /*还有一种方法，先上下对换再对角线对换*/


}
