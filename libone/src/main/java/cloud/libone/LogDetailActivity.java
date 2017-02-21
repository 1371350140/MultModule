package cloud.libone;

import android.content.Context;
import android.content.Intent;

import cloud.base.BaseActivity;

/**
 * 作者：张仁
 * 邮箱：game_zr@163.com
 * 日期：2017/2/20
 * 时间：15:42
 */
public class LogDetailActivity extends BaseActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, LogDetailActivity.class);
    }

    @Override protected int layout() {
        return R.layout.layout_log_detail;
    }
}
