package dzc.ch02;

import dzc.Apple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author dongzc15247@hundsun.com<br>
 * 开发时间: 2018-07-13<br>
 */
public class test2_1 {

    public static void prettyPrintApple(List<Apple> inventory, Apple.Predicate<Apple> predicate) {
        for (Apple apple : inventory) {
            String output = predicate.prettyPrint(apple);
            System.out.println(output);
        }
    }

    public static String processFile() throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("data.txt"))) {
            return br.readLine();
        }
    }

    public static void main(String[] args) {
    }
}
