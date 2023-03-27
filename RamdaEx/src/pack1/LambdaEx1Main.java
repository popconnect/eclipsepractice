/*
 * package pack1;
 * 
 * @FunctionalInterface public interface LambdaInter { void method1(); //void
 * method2(); }
 * 
 * public class LambdaEx1Main { public static void useFIMethod(LambdaInter fi) {
 * fi.method1(); }
 * 
 * public static void main(String[] args) { useFIMethod( new LambdaInter() {
 * public void method1() { System.out.println("익명의 내부 클래스형태"); } });
 * useFIMethod( () -> {System.out.println("람다식이용1");}); useFIMethod(() ->
 * System.out.println("람다식이용2")); }
 * 
 * 
 * }
 */