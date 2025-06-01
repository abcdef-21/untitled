package reviews.reviews2;

public class Review26 {
    public static void main(String[] args) {
        int[] numArray = {11, 22, 33, 11, 44};
        int target = 11;
        int count = 0;
        for(int i = 0; i < numArray.length; i++) {
            if(numArray[i] == target) {
                count++;
            }
        }
        System.out.println("探索した値: " + target);
        System.out.println("一致した数: " + count);
    }
}
