package com.fancy.mvpdemo.act_presenter.base;

import android.util.Log;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * Created by fancy on 2016/6/22.
 */
public abstract class BasePresenter<T> {
    String TAG = "BasePresenter";

    //view接口类型的弱引用
    protected Reference<T> mViewRef;

    public void attachView(T view) {
        Log.d(TAG, "attachView: "+mViewRef);
        mViewRef = new WeakReference<T>(view);
        Log.d(TAG, "attachView: "+mViewRef);
    }

    protected T getView() {
        return mViewRef.get();
    }

    public boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }

    public void dettachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }
}
