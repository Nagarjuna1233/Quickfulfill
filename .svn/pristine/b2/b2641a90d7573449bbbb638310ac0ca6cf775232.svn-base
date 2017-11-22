package com.quickfulfill.demo.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import quickfulfill.domain.objects.DemoDto;

import com.quickfulfill.service.demo.DemoService;

/**
 * This class only for initial demo .
 * 
 * @author 1194-Techouts
 * @since 14-12-2016
 *
 */
@Component
@Path("/demo")
public class DemoRest {
	private static final Logger LOG = LoggerFactory.getLogger(DemoRest.class);

	private DemoService demoService;
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public DemoDto getTrackInJSON() {
		LOG.debug("In getTrackInJSON()");
		return demoService.getDemoDto();
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(DemoDto track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();

	}

	public DemoService getDemoService() {
		return demoService;
	}

	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}

}