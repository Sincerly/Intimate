package com.sincerly.intimate.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.sincerly.intimate.R;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/4/18.
 *
 * @link setContentViewFront
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentViewFront();
        setContentView(getLayoutId());
        initView();
        ButterKnife.bind(this);
    }

    protected void setContentViewFront(){
        //TODO:用来设置基础属性 例如无标题，沉浸式
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    protected abstract int getLayoutId();
    protected abstract void initView();
}
