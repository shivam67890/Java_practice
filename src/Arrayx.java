//import java.util.*;
//class Arrayx {
//    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 6,4, 5));
//        int larg=Integer.MIN_VALUE;
//        int seclar =Integer.MIN_VALUE;
//        for (int i = 0; i < arr.size(); i++) {
//            if(arr.get(i)>larg){
//                seclar=larg;
//                larg=arr.get(i);
//            }
//            if(arr.get(i)>seclar && arr.get(i)!=larg  ){
//                seclar=larg;
//                seclar=arr.get(i);
//            }
//        }
//        System.out.println(seclar);
//    }
//}

//
//import java.util.*;
//
//class Arrayx {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<>();
//        int n = 3;
//        for (int i = 0; i < n; i++) {
//            int temp = in.nextInt();
//            arr.add(temp);
//        }
//        bubble_sort(arr);
//        System.out.println(arr);
//    }
//
//    static void bubble_sort(ArrayList<Integer> arr) {
//        for (int i = arr.size()-1; i >= 0; i--) {
//            for (int j = 0; j <= i-1; j++) {
//                if(arr.get(j)>arr.get(j+1)){
//                    Collections.swap(arr,j,j+1);
//                }
//            }
//        }
//    }
//}
//
////mergeSort
//import java.util.*;
//class Arrayx{
//    public static void main(String[] args) {
//        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(2,1,4,7,3,5));
//        int n=arr.size();
//        mergerSort(arr,0,n-1);
//        System.out.println(arr);
//    }
//    static void mergerSort(ArrayList<Integer>arr,int low,int high){
//        if(low>=high) return ;
//        int mid=(low+high)/2;
//        mergerSort(arr,low,mid);
//        mergerSort(arr,mid+1,high);
//        mergeAlgorithm(arr,low,mid,high);
//    }
//    static void mergeAlgorithm(ArrayList<Integer>arr,int low,int mid,int high){
//        ArrayList<Integer> store=new ArrayList<>();
//        int left=low;
//        int right=mid+1;
//        while(left <= mid && right <=high) {
//            if (arr.get(left) < arr.get(right)) {
//                store.add(arr.get(left));
//                left++;
//            } else {
//                store.add(arr.get(right));
//                right++;
//            }
//        }
//            while(left<=mid){
//                store.add(arr.get(left));
//                left++;
//
//            }
//
//            while(right<=high){
//                store.add(arr.get(right));
//                right++;
//            }
//            for (int i=low;i<=high;i++){
//                arr.set(i,store.get(i-low));
//            }
//        }
//}


//kho kho
    import java.util.*;
class Arrayx{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=8;
        ArrayList<Integer> arr=new ArrayList<>();
        int k;
        for (int i=0;i<n;i++){
            arr.add(in.nextInt());
        }
        k=Integer.MAX_VALUE;
        int maxConsecutive=0;
        for (int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr.get(j);
                if(sum==0){
                    maxConsecutive = Math.max(maxConsecutive, j - i + 1);

                }
            }
        }
        System.out.println(maxConsecutive);
    }
}