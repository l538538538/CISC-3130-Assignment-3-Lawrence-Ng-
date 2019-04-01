import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class FrequencyList {
        public static void main(String[]args) throws IOException{
              
        FileInputStream read = new  FileInputStream("song.txt");
        Scanner fileInput = new Scanner(read);

        ArrayList<String> words = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<Integer>();
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        while(fileInput.hasNext()){
        	String nextWord = fileInput.next();
        	String lower = nextWord.toLowerCase();
        	if(words.contains(lower)){
        		int index = words.indexOf(lower);
        		count.set(index, count.get(index) + 1);
        		}
        		else{
        			words.add(lower);
        			count.add(1);
        			}
             }
        
        for(int i = 0; i < words.size(); i++){
        	result.put(words.get(i), count.get(i));
        }

        fileInput.close();
        read.close();
        
        Set set = result.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
        	Map.Entry mentry = (Map.Entry)iterator.next();
        	System.out.print(mentry.getValue() + " : " );
        	System.out.println(mentry.getKey());
        	
      }

}
}
