package ir.fanap.wallet_dependencies;

import java.util.function.Consumer;

/**
 * Created by R.Sharifi
 * on 22 Dec 2020
 */
public class Dependency {
    public static String VERSION = "1.1.4";

    void test() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            Consumer consumer = new Consumer<String>() {
                @Override
                public void accept(String o) {

                }
            };
        }
    }
}
