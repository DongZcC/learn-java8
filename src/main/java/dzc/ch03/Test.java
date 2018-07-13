package dzc.ch03;

import dzc.Apple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author dongzc15247@hundsun.com<br>
 * 开发时间: 2018-07-13<br>
 */
public class Test {

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader bf = new BufferedReader(new FileReader("data.txt"))) {
            return p.process(bf);
        }
    }


    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                results.add(s);
            }
        }
        return results;
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }


    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> results = new ArrayList<>();
        for (T t : list) {
            results.add(f.apply(t));
        }
        return results;
    }


    public static void main(String[] args) throws IOException {
        String oneLine = processFile(BufferedReader::readLine);
        String twoLines = processFile((BufferedReader br) -> br.readLine() + br.readLine());

        List<Integer> l = map(Arrays.asList("lambdas", "in", "action"), String::length);
    }
}
