###### //爷类
###### public class A {
###### public String show(D obj){
###### return ("A and D");
###### }
###### public String show(A obj){
###### return ("A and A");
###### }
###### }
###### //父类
###### public class B extends A{
###### public String show(B obj){
###### return ("B and B");
###### }
###### public String show(A obj){
###### return ("B and A");
###### }
###### }

###### //孙类
###### public class C extends B{

###### }
###### //孙类
###### public class D extends B{

###### }
###### //测试类。关于输出，希望大家最好一次只去掉一个注释，这才不会被搞晕。

###### public static void main(String[] args) {
###### A a1 = new A();
###### A a2 = new B();
###### B b = new B();
###### C c = new C();
###### D d = new D();
###### //System.out.println(a1.show(b)); // ①
###### //System.out.println(a1.show(c)); // ②
###### // System.out.println(a1.show(d)); // ③
###### // System.out.println(a2.show(b)); // ④
###### // System.out.println(a2.show(c)); // ⑤
###### // System.out.println(a2.show(d)); // ⑥
###### //System.out.println(b.show(b)); // ⑦
###### // System.out.println(b.show(c)); // ⑧
###### // System.out.println(b.show(d)); //9
###### }

###### //最终结果：

###### A and A
###### A and A
###### A and D
###### B and A
###### B and A
###### A and D
###### B and B
###### B and B
###### A and D

