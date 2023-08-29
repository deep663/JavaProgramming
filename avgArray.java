public class avgArray {
    public static void main(String args[]){
        int array[] = {2, 3, 4, 5};
        int i, avg = 0;
        for(i=0; i<4; i++){
            avg = avg + array[i];
        }
        System.out.println("Average = "+ avg);
    } 
}
