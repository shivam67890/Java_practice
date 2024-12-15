//import java.util.*;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 5, 2, 34, 1, 9));
//        selectionsort(arr);
//        System.out.println(arr);
//    }
//
//    static void selectionsort(ArrayList<Integer> arr) {
//        for (int i = 0; i < arr.size() ; i++) {
//            int min = i;
//            for (int j = i + 1; j < arr.size(); j++) {
//                if (arr.get(j) < arr.get(min)) {
//                    min = j;
//                }
//            }
//            Collections.swap(arr,i,min);
//        }
//    }
//}
//
//import java.util.*;
//class Main{
//    public static void main(String[] args) {
//        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,1,2,2,3,24,3,4,5,5));
//        Scanner in=new Scanner(System.in);
//        HashMap<Integer,Integer> freqmap=new HashMap<>();
//        int k=0;
//        for (int i=0;i<arr.size();i++){
//            if(freqmap.containsKey(arr.get(i))){
//                freqmap.put(arr.get(i),freqmap.get(arr.get(i))+1);
//            }
//            else{
//                freqmap.put(arr.get(i),1);
//            }
//        }
//        System.out.println(freqmap);
//    }
//}


