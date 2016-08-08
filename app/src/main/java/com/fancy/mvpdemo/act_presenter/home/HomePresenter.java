package com.fancy.mvpdemo.act_presenter.home;


import com.fancy.mvpdemo.act_interface.home.IHome;
import com.fancy.mvpdemo.act_presenter.base.BasePresenter;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * create by 肖芳.
 */
public class HomePresenter extends BasePresenter<IHome> {
    private IHome iview;

    public HomePresenter(IHome main) {
        this.attachView(main);
        iview = getView();
    }
}
