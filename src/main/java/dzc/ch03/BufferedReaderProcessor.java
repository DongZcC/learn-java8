package dzc.ch03;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author dongzc15247@hundsun.com<br>
 * 开发时间: 2018-07-13<br>
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader bufferedReader) throws IOException;
}
