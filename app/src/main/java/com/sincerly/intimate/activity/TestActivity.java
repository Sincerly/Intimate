package com.sincerly.intimate.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sincerly.intimate.R;
import com.sincerly.intimate.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/4/18.
 */

public class TestActivity extends BaseActivity {
    @BindView(R.id.textView)
    TextView mTextView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_test;
    }

    @Override
    protected void initView() {

    }

    @OnClick(R.id.textView)
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textView:
                break;
        }
    }
}
