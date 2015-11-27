package math;

/**
 * Created by ZoeLiu on 9/24/15.
 */
public class reverseBit {
    public int reverse(int num){
        //in- place reverse, use exclusive or to change 1 to 0, 0 to 1
        for(int i = 0; i < 16; i++){
            int right = ((num >> i) & 1);
            int left = (num >> (31 - i) & 1);
            if(left != right) {
                num ^= (1 << i);
                num ^= (1 << (31 - i));
            }
        }
        return num;
    }
}
