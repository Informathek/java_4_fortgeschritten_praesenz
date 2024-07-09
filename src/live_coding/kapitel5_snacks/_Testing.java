package live_coding.kapitel5_snacks;

public class _Testing {
    public static int findMax(int arr[]){
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
//        System.out.println("1");
    }
}
