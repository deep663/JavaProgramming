public class twoDarray {
    public static void main(String[] args) {
        int twoD[][] = new int [3][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];

        twoD[0][0] = 30;
        twoD[1][0] = 30;
        twoD[1][1] = 500;
        twoD[2][0] = 3000;
        twoD[2][1] = 5000;
        twoD[2][2] = 5000;

        int i, j;
        for(i=0; i<4; i++){
            for(j=0; j<i+1; j++){
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
