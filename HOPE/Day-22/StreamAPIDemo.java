import java.util.*;
import java.util.stream.*;

class StreamAPIDemo {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(4,1,5,6,2,3);

        
        List<Integer> r = new ArrayList<>();
        for(int i=0; i<l.size(); i++){
            if(l.get(i)%2==0){
                r.add(l.get(i)*2);
            }
        }
        Collections.sort(r);
        System.out.println(r);
    
        List<Integer> r2 = l.stream()
                            .filter(x->x%2==0)
                            .map(x->x*2)
                            .sorted()
                            .collect(Collectors.toList());

        System.out.println(r2);
    }
}