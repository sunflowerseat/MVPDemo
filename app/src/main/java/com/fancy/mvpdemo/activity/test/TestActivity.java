package com.fancy.mvpdemo.activity.test;

import android.os.Bundle;

import com.fancy.mvpdemo.R;
import com.fancy.mvpdemo.act_interface.test.ITest;
import com.fancy.mvpdemo.act_presenter.test.TestPresenter;
import com.fancy.mvpdemo.activity.base.BaseActivity;

/**
 * create by 肖芳.
 */
public class TestActivity extends BaseActivity<ITest, TestPresenter> implements ITest {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


    }

    @Override
    protected TestPresenter createPresenter() {
        return new TestPresenter(this);
    }
}
