import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * Created by zhuozengsi on 4/1/16.
 */
public class Main {

    public static void main(String[] args){
        SoftReference<Person>[] people = new SoftReference[10000];
        for(int i = 0; i < people.length; i ++){
            people[i] = new SoftReference<>(new Person("ZHUO" + i, (i + 1)*4%100));
        }

        System.out.println(people[2].get());
        System.out.println(people[5].get());

        System.gc();
        System.runFinalization();

        System.out.println(people[2].get());
        System.out.println(people[5].get());

        Person person = new Person("ZHUO Zeng-si", 25);
        WeakReference<Person> wf = new WeakReference<>(person);
        person = null;
        System.out.println(wf.get());
        System.out.println(wf);
        System.gc();
        System.runFinalization();
        System.out.println(wf.get());
        System.out.println(wf);

    }

}
