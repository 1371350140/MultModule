package cloud.aartest;

import android.util.Log;
import android.view.View;

import com.google.gson.Gson;

import cloud.base.BaseActivity;
import cloud.base.BaseMainActivity;
import cloud.libtwo.TwoMainActivity;

public class MainActivity extends BaseActivity {


    @Override protected int layout() {
        return R.layout.activity_main;
    }

    @Override protected void init() {
        super.init();

        findViewById(R.id.tv_base_main).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Log.d("MainActivity", "tv_base_main");
                startActivity(BaseMainActivity.createIntent(MainActivity.this));
            }
        });


        findViewById(R.id.tv_base_main_log).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Log.d("MainActivity", new Gson().toJson("d"));
                startActivity(TwoMainActivity.createIntent(MainActivity.this));
            }
        });

    }
}
