import com.jwebmp.plugins.angularionslider.implementations.AngularSliderModuleInclusion;

module com.jwebmp.plugins.angularionslider {
	exports com.jwebmp.plugins.angularionslider;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.jwebmp.plugins.ionrangeslider;

	requires com.google.common;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularionslider.AngularIonSliderPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularDirective with com.jwebmp.plugins.angularionslider.AngularIonSliderDirective;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with AngularSliderModuleInclusion;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularionslider.implementations.AngularIonSliderExclusionsModule;

}
