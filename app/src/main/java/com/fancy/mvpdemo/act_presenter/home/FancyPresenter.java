package com.fancy.mvpdemo.act_presenter.home;

import com.fancy.mvpdemo.act_interface.home.IFancy;
import com.fancy.mvpdemo.act_presenter.base.BasePresenter;

/**
 * Created by 肖芳.
 */
public class FancyPresenter extends BasePresenter<IFancy> {
    private IFancy iview;

    public FancyPresenter(IFancy main) {
        this.attachView(main);
        iview = getView();
    }
}
