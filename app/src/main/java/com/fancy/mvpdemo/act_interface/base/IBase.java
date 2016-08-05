package com.fancy.mvpdemo.act_interface.base;

import android.content.Context;

/**
 * Created by Administrator on 2016/6/23.
 */
public interface IBase {
    void showServerError(String s);

    void showNoNetTextView();

    void showTextView(String s);


    void requestTimeout();


    void showToast(String s);

    void showSuccessToast(String s);

    boolean hasNet();

    void showProgress(boolean visible);

    Context getMApplicationContext();

    Context getMContext();

    void setNowRequest(boolean flag);
}
