public class Main {
    public static void main(String[] args) {


        System.out.println("staticvar = "+TestStatic.getStaticVar());
        TestStatic.setStaticVar(25);
        System.out.println("staticvar = "+TestStatic.getStaticVar());


        System.out.println("staticvar = "+TestStatic.getStaticVar());
        TestStatic.setStaticVar(12);
        System.out.println("staticvar = "+TestStatic.getStaticVar());


        System.out.println("staticvar = "+TestStatic.getStaticVar());


    }
}


