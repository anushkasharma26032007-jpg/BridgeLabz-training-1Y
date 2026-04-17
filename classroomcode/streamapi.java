package classroomcode;
import java.util.ArrayList;
import java.util.logging.Filter;
import java.util.stream.Stream;
import java.util.Optional;
public class streamapi {
        public static void main(String[] args){
            //First way to Create Stream using Stream.of()
            Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
            //System.out.println(stream);
            stream.forEach(a->System.out.println(a));
            Stream<String> stm = Stream.of("aa","bb","cc...");
            stm.forEach(System.out::println);


            //Second way to Create Stream using Stream()
            ArrayList<Integer> al = new ArrayList<>();
            al.add(11);
            al.add(23);
            al.add(34);
            al.add(45);
            al.add(56);
            System.out.println("=================Using stream() method====================");
            Stream<Integer> stream1= al.stream();
            // stream1.forEach(a -> System.out.println(a));
            stream1.forEach(System.out::println);
        Stream<String> stream2 = Stream.of("Anushka ","Rohit","hardik","Anubhav","bumrah");
        stream2.filter(n->n.startsWith("A")).forEach(System.out::println);

        ArrayList<Integer> list = new ArrayList<>();
             list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            Stream<Integer> stream3 = list.stream();
            Stream<Integer> FilterStream = stream3.filter(i->i%2==0);
            FilterStream.forEach(System.out::println);

            list.stream().filter(i->i%2 ==0).forEach(System.out::println);
        }
}
