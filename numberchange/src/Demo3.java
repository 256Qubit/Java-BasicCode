public class Demo3 {
    public static void main(String[] args) {
        byte a =3;
        byte b =4;

        /*

        隐式转换：当小的数据和大的数据类型一起运算的时候，小的类型会先转换为大的类型之后再进行运算

        byte c =a+b;

        这里的a和b是两个byte类型，它们在运算之前会将自己提升为int类型。然后再进行两个int 想加，结果类型还是int.

        要想吧int类型赋值给byte类型的变量，大的给小的不能直接给。

        java存在常量优化机制：

        byte d = 3+4;

        这里的3和4是两个常量，Java存在常量优化机制，会在编译的时候就让3和4相加，然后会自动判断7是否在byte的取值范围内。

        不在范围内直接编译出错，如果在范围内通过编译

         */
        //byte c =a+b;
        byte c=(byte) (a+b);
        System.out.println(c);
    }
}
