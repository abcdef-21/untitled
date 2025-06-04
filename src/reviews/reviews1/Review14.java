package reviews.reviews1;

public class Review14 {
    public static void main(String[] args){
        String color = "黒";
        if(color.equals("赤")){
            System.out.println("停止");
        }else if(color.equals("黄")) {
            System.out.println("注意");
        }else if(color.equals("青")) {
            System.out.println("進行");
        }else {
            System.out.println("無効な信号の色です。");
        }
    }
}
