import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {
public static int uniqueWolfs(List<Integer> arr) {
    int[] sayi = new int[5];
	int minumum = sayi[0];
    int deger = 1;
	for (int i = 0; i < arr.size(); i++) {
		switch(arr.get(i)){
        case 1:
        	sayi[0]++;
            break;
        case 2:
        	sayi[1]++;
            break;
        case 3:
        	sayi[2]++;
            break;
        case 4:
        	sayi[3]++;
            break;
        case 5:
        	sayi[4]++;
            break;
 
    }
    }
    for(int j = 0; j<sayi.length;j++){
        if(minumum < sayi[j]){
        	minumum = sayi[j];
            deger = j+1;    
        }
    }
    System.out.print("En fazla tekrar eden en kucuk sayi  "+deger);
    return deger;
}
}
public class Solution {
public static void main(String[] args) throws IOException {
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+","").split("")).map(Integer::parseInt).collect(toList());
int result = Result.uniqueWolfs(arr);
bufferedWriter.write(String.valueOf(result));
bufferedWriter.newLine();
bufferedReader.close();
bufferedWriter.close();
}
