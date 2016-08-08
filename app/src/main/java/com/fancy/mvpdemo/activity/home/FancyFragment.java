package com.fancy.mvpdemo.activity.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fancy.mvpdemo.R;
import com.fancy.mvpdemo.act_interface.home.IFancy;
import com.fancy.mvpdemo.act_presenter.home.FancyPresenter;
import com.fancy.mvpdemo.fragment.base.BaseFragment;

/**
 * create by 肖芳.
 */
public class FancyFragment extends BaseFragment<IFancy, FancyPresenter> implements IFancy {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fancy, null);


        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


    @Override
    protected FancyPresenter createPresenter() {
        return new FancyPresenter(this);
    }


}
