package ro.isr.devschool.designpatterns.behavioral.iterator;

/**
 * Created by Andrei on 13.04.2017.
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository=new NameRepository();
        for(Iterator it=nameRepository.getIterator();it.hasNext();){
            String name=(String) it.next();
            System.out.println("name "+name);
        }
    }
}
