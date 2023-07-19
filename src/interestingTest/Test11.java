package interestingTest;

import java.util.stream.IntStream;

public class Test11 {
    public static void main(String[] args) {
        int[] nums = {5};
        var numStream = IntStream.range(nums[0],nums[0]+=4);
        var result = numStream
                .map(n -> n -=2)
                .reduce((x,y) -> x+y);
        System.out.println(result.getAsInt());
    }
}
