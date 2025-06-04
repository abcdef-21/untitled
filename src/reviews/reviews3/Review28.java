package reviews.reviews3;
import java.io.*;
public class Review28 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("宛先を入力>");
        String to = br.readLine();

        System.out.print("件名を入力>");
        String subject = br.readLine();

        System.out.print("本文を入力>");
        String body = br.readLine();

        Email mail = new Email(); // インスタンス生成

        if (subject.length() == 0) { // 件名が空かどうかで分岐
            mail.send(to, body);
        } else {
            mail.send(to, subject, body);
        }
    }
}

