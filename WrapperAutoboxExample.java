import com.sun.jdi.Value;

public class WrapperAutoboxExample {
    public static void main(String[] args) {

//        int a = 10; //primitive datatype
//        Integer val1 = valueOf(a);//internally conversion through complier
//        Integer value =a;
//        System.out.println("Value "+value);
//        System.out.println("........................................");
//        int unbox = value; //assign the value of object in primitive
//        int i3 = value.intValue();//internally complier converting object to primitive
//        System.out.println(i3);
//        System.out.println("Unboxing "+unbox);

//        double b=20;
//        Double value = b;
//        System.out.println("Value "+value);
//        System.out.println("#############################################");
//        Double unbox = value;
//        double i3 = value.doubleValue();
//        System.out.println(i3);
//        System.out.println("Unboxing "+unbox);


//        short c = 9;
//        Short value = 9 ;
//        System.out.println("value "+value);
//        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        Short unbox = value;
//        short i3 =value.shortValue();
//        System.out.println(i3);
//        System.out.println("Unboxing "+unbox);

//       float d=4;
//       Float value= d;
//        System.out.println("Value "+value);
//        System.out.println("///////////////////////////////////////");
//        Float unbox = value ;
//        float i3 = value.floatValue();
//        System.out.println(i3);
//        System.out.println("Unboxing "+unbox);

//        byte e=6;
//        Byte value = e;
//        System.out.println("value "+value);
//        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//        Byte unbox = value ;
//        byte i3 = value.byteValue();
//        System.out.println(i3);
//        System.out.println("Unboxing "+unbox);


//       char ch ='a';
//       Character value = ch;
//        System.out.println("value "+value);
//        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\");
//        Character unbox = value;
//        char i3 = value.charValue();
//        System.out.println(i3);
//        System.out.println("Unboxing "+unbox);

//        boolean flag =true;
//        Boolean value =flag;
//        System.out.println("value "+value);
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        Boolean unbox =value;
//        boolean i3 = value.booleanValue();
//        System.out.println(i3);
//        System.out.println("Unboxing "+value);

          long g = 45;
          Long value = g;
          System.out.println("value "+value);
          System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
          long i3 = value.longValue();
          System.out.println(i3);
          System.out.println("unboxing "+value);
    }
}
