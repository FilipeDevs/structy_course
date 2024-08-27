import java.util.List;
import java.util.ArrayList;

class Source {
  
  public static List<Integer> mergeSort(List<Integer> nums) {

    if(nums.size() <= 1) {
      return nums;
    }

    int middle = nums.size() / 2;
    List<Integer> left = nums.subList(0, middle);
    List<Integer> right = nums.subList(middle, nums.size());
    List<Integer> sortedLeft = mergeSort(left);
    List<Integer> sortedRight = mergeSort(right);

    return mergeArrays(sortedLeft, sortedRight);
  }

  public static List<Integer> mergeArrays(List<Integer> array1, List<Integer> array2) {

    List<Integer> merged = new ArrayList<>();

    int rightArrIdx = 0;
    int leftArrIdx = 0;

    while(leftArrIdx < array1.size() && rightArrIdx < array2.size()) {
      if(array1.get(leftArrIdx) < array2.get(rightArrIdx)) {
        merged.add(array1.get(leftArrIdx));
        leftArrIdx++;
      } else {
        merged.add(array2.get(rightArrIdx));
        rightArrIdx++;
      }
    }

    // add eventual remaining elements from the other array
    merged.addAll(array1.subList(leftArrIdx, array1.size()));
    merged.addAll(array2.subList(rightArrIdx, array2.size()));
    
    return merged;
  }

}
