import com.jwebmp.plugins.weathericons.implementations.WeatherIconsInclusionModule;

module com.jwebmp.plugins.weathericons {
	requires com.jwebmp.core;
	requires com.jwebmp.core.base.angular.client;
	requires com.guicedee.guicedinjection;

	exports com.jwebmp.plugins.weathericons;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.weathericons.WeatherIconsPageConfigurator;
	provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.weathericons.implementations.WeatherExclusionsModule;
	provides com.guicedee.client.services.config.IGuiceScanModuleInclusions with WeatherIconsInclusionModule;

	opens com.jwebmp.plugins.weathericons to com.google.guice, com.jwebmp.core;
}
