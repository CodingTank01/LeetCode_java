import java.util.function.*;

class VariableData {
    public static void main(String[] args) {
        Predicate<Integer> p = x-> (x>10);
        Predicate<Integer> p2 = x-> (x%2==0);

        Function<Integer, Integer> f = x -> x*x;

        Consumer<String> c = x-> System.out.print("hi\n");

        Supplier<Double> d = ()->Math.random();

        System.out.println(p.test(4));
        System.out.println(p2.test(10));
        System.out.println(f.apply(4));
        c.accept("Hi Hello Java\n");
        System.out.println(d.get());

    }
}
