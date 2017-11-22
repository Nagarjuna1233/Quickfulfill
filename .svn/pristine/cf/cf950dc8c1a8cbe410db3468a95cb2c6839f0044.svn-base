package com.quickfulfill.demo.rest.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/** 
 * This class only for initial demo.
 * @author 1194-Techouts
 * @since 14-12-2016
 *
 */
public class DemoJerseyClient {

	private static Client client = Client.create();

	public static void main(String[] args) {
		demoGet();
		demoPost();
	}

	public static void demoGet() {
		try {
			WebResource webResource = client
					.resource("http://localhost:8080/quickfulfill-rest-api/rest/demo/get");

			ClientResponse response = webResource.accept("application/json")
					.get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Output from Server .... \n");
			System.out.println(output);

		     } catch (Exception e) {

			e.printStackTrace();

		  }

	}
	
	public static void demoPost(){
		
		try {

			WebResource webResource = client
					.resource("http://localhost:8080/quickfulfill-rest-api/rest/demo/post");

			String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";

			ClientResponse response = webResource.type("application/json")
					.post(ClientResponse.class, input);

			if (response.getStatus() != 201) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}