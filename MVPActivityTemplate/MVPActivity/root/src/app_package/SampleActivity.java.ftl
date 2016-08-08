
package  ${applicationPackage}.activity.${modular};


import android.os.Bundle;

import ${applicationPackage}.R;
import ${applicationPackage}.act_interface.${modular}.I${activityName};
import ${applicationPackage}.act_presenter.${modular}.${activityName}Presenter;
import ${applicationPackage}.activity.base.BaseActivity;

/**
 * create by 肖芳.
 */
public class ${activityClass} extends BaseActivity<I${activityName},${activityName}Presenter> implements I${activityName}{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.${activityLayoutName});
		
	
    }

    @Override
    protected ${activityName}Presenter createPresenter() {
        return new ${activityName}Presenter(this);
    }
}
