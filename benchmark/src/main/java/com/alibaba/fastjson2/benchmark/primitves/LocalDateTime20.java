package com.alibaba.fastjson2.benchmark.primitves;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.benchmark.primitves.vo.LocalDateTime20Field;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

public class LocalDateTime20 {
    static String str;
    static byte[] jsonbBytes;
    static ObjectMapper mapper = new ObjectMapper();

    public LocalDateTime20() {
        try {
            InputStream is = LocalDateTime20.class.getClassLoader().getResourceAsStream("data/date20.json");
            str = IOUtils.toString(is, "UTF-8");

            jsonbBytes = JSONB.toBytes(
                    JSON.parseObject(str, LocalDateTime20Field.class)
            );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Benchmark
    public void fastjson1(Blackhole bh) {
        bh.consume(
                com.alibaba.fastjson.JSON.parseObject(str, LocalDateTime20Field.class)
        );
    }

    @Benchmark
    public void fastjson2(Blackhole bh) {
        bh.consume(
                JSON.parseObject(str, LocalDateTime20Field.class)
        );
    }

    @Benchmark
    public void fastjson2_jsonb(Blackhole bh) {
        bh.consume(
                JSONB.parseObject(jsonbBytes, LocalDateTime20Field.class)
        );
    }

    @Benchmark
    public void jackson(Blackhole bh) throws Exception {
        bh.consume(
                mapper.readValue(str, LocalDateTime20Field.class)
        );
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(LocalDateTime20.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.MILLISECONDS)
                .warmupIterations(3)
                .forks(1)
                .build();
        new Runner(options).run();
    }
}
