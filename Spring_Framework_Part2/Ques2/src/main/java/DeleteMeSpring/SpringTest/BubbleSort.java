package DeleteMeSpring.SpringTest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgo{

    @Override
    public int[] sort(int[]nums) {
        //bubble sort logic
        return nums;
    }
}
