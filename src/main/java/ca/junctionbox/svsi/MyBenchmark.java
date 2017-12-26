package ca.junctionbox.svsi;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

class InstanceSum {
    public int sum(final int a, final int b) {
        return a + b;
    }
}

class StaticSum {
    public static int sum(final int a, final int b) {
        return a + b;
    }
}

public class MyBenchmark {
    private static final InstanceSum impl = new InstanceSum();

    @State(Scope.Thread)
    public static class Input {
        public int a = 1;
        public int b = 2;
    }

    @Benchmark
    public void testStaticMethod(Input i, Blackhole blackhole) {
        int sum = StaticSum.sum(i.a, i.b);
        blackhole.consume(sum);
    }

    @Benchmark
    public void testInstanceMethod(Input i, Blackhole blackhole) {
        int sum = impl.sum(i.a, i.b);
        blackhole.consume(sum);
    }
}
