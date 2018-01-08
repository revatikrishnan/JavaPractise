
public class Insertionsort {

    public static void main(String[] args) {
        int[] num={6,1,64,3,5,7};
        
        for(int i=1;i<num.length;i++){
            for(int j=i;j>0;j--){
                if(num[j]<num[j-1]){
                    int temp=num[j];
                    num[j]=num[j-1];
                    num[j-1]=temp;
                }
            }
        }
        
        for(int e:num){
            System.out.print(e+" ");
        }

    }

}
