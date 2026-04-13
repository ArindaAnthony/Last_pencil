import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Reader reader = new InputStreamReader(System.in);

        char[] buffer = new char[50];
        int number = reader.read(buffer);
        for (int i = number - 1; i >= 0; i--) {
            System.out.print(buffer[i]);
        }
    }
}

/*try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input;
            while ((input = reader.readLine())!= null) {
                System.out.println(input);
            }
            // start coding here
            reader.close();
        } catch (java.lang.Exception e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }*/