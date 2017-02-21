package cloud.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作者：张仁
 * 邮箱：game_zr@163.com
 * 日期：2017/2/20
 * 时间：15:20
 */
public abstract class BaseFragment extends Fragment {

    protected View rootView;

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(layout(), container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    protected abstract int layout();

}
