<?xml version="1.0"?>
<recipe>
    <#include "recipe_manifest.xml.ftl" />

	<instantiate from="root/src/app_package/SampleActivity.java.ftl"
     	to="${escapeXmlAttribute(srcOut)}/${activityClass}.java" />
		
	<instantiate from="root/res/layout/activity_sample.xml.ftl"
		to="${escapeXmlAttribute(resOut)}/layout/${activityLayoutName}.xml" />
		
	<instantiate from="root/src/app_package/INone.java.ftl"
     	to="${escapeXmlAttribute(manifestOut)}/java/${slashedPackageName(applicationPackage)}/act_interface/${modular}/I${activityName}.java" />
		
	<instantiate from="root/src/app_package/NonePresenter.java.ftl"
     	to="${escapeXmlAttribute(manifestOut)}/java/${slashedPackageName(applicationPackage)}/act_presenter/${modular}/${activityName}Presenter.java" />

	<open file="${escapeXmlAttribute(resOut)}/layout/${activityLayoutName}.xml"/>        

 	<open file="${escapeXmlAttribute(srcOut)}/${activityClass}.java" />
</recipe>
