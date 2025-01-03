package com.findroute.gateway.config;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.HandlerFunction;
import org.springframework.web.servlet.function.RequestPredicate;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class route {

	
	
	@Bean 
	public RouterFunction<ServerResponse> busServiceRoute(){
		return GatewayRouterFunctions.route("Bus-Service")
				.route(RequestPredicates.path("/bus/*"), HandlerFunctions.http("http://localhost:8081")).build();
	}
	
	@Bean 
	public RouterFunction<ServerResponse> bookingServiceRoute(){
		return GatewayRouterFunctions.route("Bus-Service")
				.route(RequestPredicates.path("/booking/*"), HandlerFunctions.http("http://localhost:8082")).build();
	}
	
	
	@Bean 
	public RouterFunction<ServerResponse> inventoryServiceRoute(){
		return GatewayRouterFunctions.route("Bus-Service")
				.route(RequestPredicates.path("/bus/*"), HandlerFunctions.http("http://localhost:8083")).build();
	}
	
	@Bean 
	public RouterFunction<ServerResponse> passengerServiceRoute(){
		return GatewayRouterFunctions.route("Bus-Service")
				.route(RequestPredicates.path("/bus/*"), HandlerFunctions.http("http://localhost:8084")).build();
	}
	
	@Bean 
	public RouterFunction<ServerResponse> busSwaggerServiceRoute(){
		System.out.println("bus Serviceeeeeee swaggggerr");
		return GatewayRouterFunctions.route("Bus-Service-Swagger")
				.route(RequestPredicates.path("/Bus-Service/v3/api-docs"), HandlerFunctions.http("http://localhost:8081/v3/api-docs"))
				.build();
	}
	
	@Bean 
	public RouterFunction<ServerResponse> bookingSwaggerServiceRoute(){
		
		return GatewayRouterFunctions.route("Bus-Service-Swagger")
				.route(RequestPredicates.path("/Booking-Service/v3/api-docs"), HandlerFunctions.http("http://localhost:8082/v3/api-docs")).build();
	}
	
	@Bean 
	public RouterFunction<ServerResponse> inventorySwaggerServiceRoute(){
		return GatewayRouterFunctions.route("Bus-Service-Swagger")
				.route(RequestPredicates.path("/Tickets-Inventory-Service/v3/api-docs"), HandlerFunctions.http("http://localhost:8083/v3/api-docs")).build();
	}
	@Bean 
	public RouterFunction<ServerResponse> passengerSwaggerServiceRoute(){
		return GatewayRouterFunctions.route("Bus-Service-Swagger")
				.route(RequestPredicates.path("/Passenger-Service/v3/api-docs"), HandlerFunctions.http("http://localhost:8084/v3/api-docs")).build();
	}
}
