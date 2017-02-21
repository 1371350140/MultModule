package cloud.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 作者：张仁
 * 邮箱：game_zr@163.com
 * 日期：2017/2/20
 * 时间：15:04
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int layout = layout();
        if (layout != -1) {
            setContentView(layout);
        }

        init();

    }

    protected abstract int layout();

    protected void init() {

    }

}
