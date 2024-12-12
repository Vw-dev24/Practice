import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

     SingletonDesignPattern sgp1= SingletonDesignPattern.getInstance();

        int[] sampleArray={1,2,3,4,5,3,5,3,2};
        int splitSize=4;
        List<int[]> list=splitArray(sampleArray,splitSize);
        list.forEach(splitArray-> System.out.println(Arrays.toString(splitArray)));
    }
    private static List<int[]> splitArray(int[] arr, int chunkSize){
        List<int[]> result=new ArrayList<>();
        for(int i=0; i< arr.length; i+=chunkSize){
            int end=Math.min(arr.length, i+chunkSize);
            int[] subArray=Arrays.copyOfRange(arr,i,end);
            result.add(subArray);
        }

        return result;
    }
}