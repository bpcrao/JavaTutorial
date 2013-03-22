package generics;

import java.util.HashSet;
import java.util.Set;

public class RawWildcard {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Set<?> dataSet = new HashSet<String>();
        print(dataSet);
        
        
    }
    
    public static void print(Set<?> data){       
        
    }

}
