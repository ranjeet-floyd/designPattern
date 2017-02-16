package com.futurefry.designPattern.serviceProvider;

import java.util.HashMap;
import java.util.Map;

public class Services {

	private  Services() {
		System.out.println("Private");
	}
	
	private static final Map<String, Provider> providers = new HashMap<>();
	
	public static final String DEFAULT_PROVIDER_NAME = "<def>";
	
	//provider registration api
	public static void registerDefaultProvider(Provider p){
		registerProvider(DEFAULT_PROVIDER_NAME, p);
	}
	
	public static void registerProvider(String name, Provider p){
		providers.put(name, p);
	}
	
	//Serive access api
	
	public static Service newInstance(){
		return newInstance(DEFAULT_PROVIDER_NAME);
	}
	
	public static Service newInstance(String name){
		Provider p =  providers.get(name);
		
		if( null == p ){
			throw new IllegalArgumentException("No provider registered with name : " + name);
		}
		
		return p.newService();
	}
	
}
