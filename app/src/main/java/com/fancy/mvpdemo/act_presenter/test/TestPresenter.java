package com.fancy.mvpdemo.act_presenter.test;

import com.fancy.mvpdemo.act_interface.test.ITest;
import com.fancy.mvpdemo.act_presenter.base.BasePresenter;

/**
 * create by 肖芳.
 */
public class TestPresenter extends BasePresenter<ITest> {
    private ITest iview;

    public TestPresenter(ITest main) {
        this.attachView(main);
        iview = getView();
    }


    public void getData() {
        iview.showData("hello , i'm mvp");
    }
}
