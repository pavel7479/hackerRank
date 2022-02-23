import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int length = 0;
        List<Integer> arr1 = null;
        List<Integer> arr2 = null;
        List<Integer> arrSumm = new ArrayList<>();
        boolean stop = true;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
           while(stop) {
               String str = reader.readLine().strip();
               length = Integer.parseInt(str);
               arr1 = Arrays.asList(reader.readLine().strip().split(" "))
                       .stream()
                       .map(Integer::parseInt)
                       .collect(Collectors.toList());
               arr2 = Arrays.asList(reader.readLine().strip().split(" "))
                       .stream()
                       .map(Integer::parseInt)
                       .collect(Collectors.toList());

               for (int i = 0; i < length; i++) {
                   arrSumm.add(arr1.get(i));
                   arrSumm.add(arr2.get(i));
               }

               stop = false;
           }
        } catch (IOException e) {
            e.printStackTrace();
        }



        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
        for (int i : arrSumm) {
            try {
                writer.write(String.valueOf(i));
                writer.write(" ");
                writer.flush();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}