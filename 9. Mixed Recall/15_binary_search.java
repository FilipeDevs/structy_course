import java.util.List;

class Source {
  public static int binarySearch(List<Integer> numbers, int target) {

    int lowPointer = 0;
    int highPointer = numbers.size() - 1;

    while(lowPointer <= highPointer) {
      int midIdx = ((lowPointer + highPointer) / 2);
      int midValue = numbers.get(midIdx);
      if(target < midValue) {
        highPointer = midIdx - 1;
      } else if(target > midValue) {
        lowPointer = midIdx + 1;
      } else {
        return midIdx;
      }
    } 
    
    return - 1;
  }

}
