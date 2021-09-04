import java.io.*;

public class usefulMethodSet{

    BufferedWriter bufferedWriter;

    public usefulMethodSet(){
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    }
    
    int readInt() throws IOException {
        boolean isNegative = false;
        int sum = 0;
        while (true) {
            int input = System.in.read();
            if (input == '\n' || input == ' ') {
                return isNegative ? -1 * sum : sum;
            } else if (input == '-') {
                isNegative = true;
            } else {
                sum = (sum * 10) + (input - '0');
            }
        }
    }
}