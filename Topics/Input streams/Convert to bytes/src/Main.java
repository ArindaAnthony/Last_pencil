import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        byte[] buffer = new byte[100];
        int word = inputStream.read(buffer);

       for (int i = 0; i < word; i++) {
           System.out.print(buffer[i]);
       }
    }
}