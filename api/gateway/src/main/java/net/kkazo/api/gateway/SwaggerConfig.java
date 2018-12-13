package net.kkazo.api.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SwaggerConfig {

//	@Autowired
//	ZuulProperties properties;
//
//	@Primary
//	@Bean
//	public SwaggerResourcesProvider swaggerResourcesProvider() {
//		return () -> {
//			List resources = new ArrayList();
//			properties.getRoutes().values().stream()
//				.forEach(route -> resources.add(createResource(route.getServiceId(), route.getId(), "1.0")));
//			return resources;
//		};
//	}
//	private SwaggerResource createResource(String name, String location, String version) {
//		SwaggerResource swaggerResource = new SwaggerResource();
//		swaggerResource.setName(name);
//		swaggerResource.setLocation("/" + location + "/v1/api-docs");
//		swaggerResource.setSwaggerVersion(version);
//		return swaggerResource;
//	}
}
