package cloud.base;

import android.content.Context;
import android.content.Intent;

/**
 * 作者：张仁
 * 邮箱：game_zr@163.com
 * 日期：2017/2/20
 * 时间：15:25
 */
public class BaseMainActivity extends BaseActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, BaseMainActivity.class);
    }

    @Override protected int layout() {
        return R.layout.activity_base;
    }
}
