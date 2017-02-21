package cloud.libtwo;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import cloud.base.BaseActivity;

/**
 * 作者：张仁
 * 邮箱：game_zr@163.com
 * 日期：2017/2/21
 * 时间：10:40
 */
public class TwoMainActivity extends BaseActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, TwoMainActivity.class);
    }

    @Override protected int layout() {
        return R.layout.two_activity;
    }

    @Override protected void init() {
        super.init();

        findViewById(R.id.tv_lib_one).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
//                startActivity(new Intent("cloud.libone.LogActivity"));
            }
        });

    }
}
