package java0.jiChu.dataType;

public class Main {
    static byte b;   //1B       0   -128 127
    static short s;  //2B       0
    static int i; //4B   0
    static long l; //8B  0
    static float f; //4B  0.0
    static double d; //8B  0.0

    static boolean boo; //1B  false
    static char c; //2B  'u0000'  单一的 16 位 Unicode 字符
    public static void main(String[] args) {
        /*
        * 数据类型
        * */
//        System.out.println(Byte.SIZE);
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(b);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(l);
//        System.out.println(f);
//        System.out.println(d);
//        System.out.println(boo);
//        System.out.println(c);
        
//        long ll=100L;
//        System.out.println("ll = " + ll);
//
//        float ff=22.39789f;
//        ff=ff+0.001f;
//        System.out.println("ff = " + ff);

//        double dd=2.989D;
//        System.out.println(dd);

//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Float.MIN_VALUE);


        /*
        * 流程控制
        * */
        Object obj=(Object)i;
        switch (obj.getClass().getSimpleName()){
            case "Byte":
                System.out.println("byte");
                break;
            case "Short":
                System.out.println("short");
                break;
            default:
                System.out.println("default");
        }

    }

}
