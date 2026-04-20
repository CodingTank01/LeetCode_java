@FunctionalInterface
interface A{
    public int sum(int a, int b);
}

interface B{
    public int sum(int a, int b);
}

class C implements B{
    public int sum(int a, int b){
        return a+b;
    }
}

class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        A temp =(a,b) -> a+b;
        System.out.println(temp.sum(10, 20));   

        B temp2 = new B(){
            public int sum(int a, int b) {
                return a+b;
            }
        };
        System.out.println(temp2.sum(10, 20));

        C temp3 = new C();
        System.out.println(temp3.sum(10,20));
    }
}
