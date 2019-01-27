module com.jwebmp.plugins.angularionslider {
	exports com.jwebmp.plugins.angularionslider;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.plugins.ionrangeslider;

	requires com.google.common;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularionslider.AngularIonSliderPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularDirective with com.jwebmp.plugins.angularionslider.AngularIonSliderDirective;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularionslider.implementations.AngularIonSliderExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularionslider.implementations.AngularIonSliderExclusionsModule;

}
