package DeleteMeSpring.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

interface SortAlgo{
    public int[] sort(int[]nums);
}



@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgo sortalgo;

//    public BinarySearchImpl(SortAlgo sortalgo){
//
//        this.sortalgo=sortalgo;
//
//    }

    public int binarySearch(int[]nums,int numtosearch){

       sortalgo.sort(nums);
        return 8;
    }


}
