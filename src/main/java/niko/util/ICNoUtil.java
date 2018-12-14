package niko.util;

import com.google.common.base.Strings;

import org.junit.Test;

/**省份证号脱敏
 * @Author: zhaozongqiang
 * @Date: Create in 2018/11/27
 */
public class ICNoUtil {
    public static String icNoConceal(String val) {
        if (Strings.isNullOrEmpty(val)) {
            return "";
        }
        return val.replaceAll("(\\d{3})(\\d{11})(\\d{4}|\\d{3}\\S)","$1***********$3");
    }

    @Test
    public void test(){
        String icNo =  icNoConceal("513822198708092312");
       String icNo1 =  icNoConceal("52020219891209111X");
       System.out.println(icNo);
    }
}
