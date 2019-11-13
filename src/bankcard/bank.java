package bankcard;

import java.util.Random;
import java.util.Scanner;

public class bank {
    public static String getRandom2(int len) {

        Random r = new Random();
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < len; i++) {
            rs.append(r.nextInt(10));
                    }
               return rs.toString();
            }
    public String  bankcard(String code){
        StringBuilder stringBuilder=new StringBuilder();
        String icbc="9558883602178236";//工商银行
        String bc="6222615681171133";//交通银行
        String abc="6228488854962105";//农业银行
        String cmb="6226203322845"; //民生银行
        String cmbc="6214836549954";//招商银行
        String hb="6230207423038";//华夏银行
        String ccb="6217005572056377";//建设银行

        if (code.equals("icbc")){
            stringBuilder.append(icbc);
            stringBuilder.append(getRandom2(3));
        }else if (code.equals("bc")){
            stringBuilder.append(bc).append(getRandom2(3));
        }else if (code.equals("abc")){
            stringBuilder.append(abc).append(getRandom2(3));
        }else if (code.equals("cmb")){
            stringBuilder.append(cmb).append(getRandom2(3));
        }else if (code.equals("cmbc")){
            stringBuilder.append(cmbc).append(getRandom2(3));
        }else if (code.equals("hb")){
            stringBuilder.append(hb).append(getRandom2(3));
        }else if (code.equals("ccb")){
            stringBuilder.append(ccb).append(getRandom2(3));
        }
        return stringBuilder.toString();
    }

    public static void main(String args[]){
        bank b=new bank();
        System.out.println(b.bankcard("icbc"));
    }
}
