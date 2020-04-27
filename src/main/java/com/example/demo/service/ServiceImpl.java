package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.example.demo.config.DemoConfig;

@Component
public class ServiceImpl {	
	@Autowired
	DemoConfig demoConfig;
	RestTemplate restTemplate = new RestTemplate();
	
	public <T> String getDayParts(){
		try {
//			final ResponseEntity<List<DayPartsTO>> response = 
//		    		  restTemplate.exchange(demoConfig.getUrl(), HttpMethod.GET,
//		          getHttpEntity(demoConfig.getJwtToken()), new ParameterizedTypeReference<List<DayPartsTO>>() {
//		          });
			final ResponseEntity<List<T>> response = 
		    		  restTemplate.exchange(demoConfig.getUrl(), HttpMethod.GET,
		          getHttpEntity(demoConfig.getJwtToken()), new ParameterizedTypeReference<List<T>>() {
		          });
			 return response.getBody().toString();
		      
		    } catch (HttpStatusCodeException ex) {
		      System.out.println(ex);
		      throw ex;
		    }
		 
	}
	
	public HttpEntity<String> getHttpEntity(String authorization) {
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.set("Authorization", authorization);
	    return new HttpEntity<>(headers);
	  }

}
