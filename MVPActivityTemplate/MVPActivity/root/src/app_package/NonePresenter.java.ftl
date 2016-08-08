
package  ${applicationPackage}.act_presenter.${modular};


import ${applicationPackage}.act_interface.${modular}.I${activityName};
import ${applicationPackage}.act_presenter.base.BasePresenter;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * create by 肖芳.
 */
public class ${activityName}Presenter extends BasePresenter<I${activityName}> {
    private I${activityName} iview;

    public ${activityName}Presenter(I${activityName} main) {
        this.attachView(main);
        iview = getView();
    }
}
