package com.fancy.mvpdemo.act_presenter.home;


import com.fancy.mvpdemo.act_interface.home.IHi;
import com.fancy.mvpdemo.act_presenter.base.BasePresenter;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * create by 肖芳.
 */
public class HiPresenter extends BasePresenter<IHi> {
    private IHi iview;

    public HiPresenter(IHi main) {
        this.attachView(main);
        iview = getView();
    }
}
