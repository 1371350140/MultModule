package cloud.libone;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import cloud.base.BaseActivity;

/**
 * 作者：张仁
 * 邮箱：game_zr@163.com
 * 日期：2017/2/20
 * 时间：15:40
 */
public class LogActivity extends BaseActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, LogActivity.class);
    }

    @Override protected int layout() {
        return R.layout.layout_log;
    }

    @Override protected void init() {
        super.init();
        findViewById(R.id.tv_log).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                startActivity(LogDetailActivity.createIntent(LogActivity.this));
            }
        });
    }
}
