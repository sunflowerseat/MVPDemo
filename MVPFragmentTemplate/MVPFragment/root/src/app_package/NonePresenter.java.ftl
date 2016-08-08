package  ${applicationPackage}.act_presenter.${modular};

import ${applicationPackage}.act_interface.${modular}.I${pageName};
import ${applicationPackage}.act_presenter.base.BasePresenter;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by 肖芳.
 */
public class ${pageName}Presenter extends BasePresenter<I${pageName}> {
    private I${pageName} iview;

    public ${pageName}Presenter(I${pageName} main) {
        this.attachView(main);
        iview = getView();
    }
}
