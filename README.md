Results
=======

These results were benchmarked on a Late 2013 MacBook Pro with a 2.3GHz i7, 16GB
of RAM and OS X High Sierra.

```
java -jar target/benchmark.jar

# -- snip --

Benchmark                        Mode  Cnt          Score         Error  Units
MyBenchmark.testInstanceMethod  thrpt  200  414036562.933 ± 2198178.163  ops/s
MyBenchmark.testStaticMethod    thrpt  200  417194553.496 ± 1055872.594  ops/s
```

Special thanks to this article by Jakob Jenkov on instrumenting JMH benchmarks
and avoiding some common JVM hotspot pitfalls;

http://tutorials.jenkov.com/java-performance/jmh.html#writing-good-benchmarks
