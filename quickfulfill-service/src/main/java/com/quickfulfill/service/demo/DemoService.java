package com.quickfulfill.service.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfulfill.domain.objects.DemoDto;

public class DemoService {
	private static final Logger LOG = LoggerFactory
			.getLogger(DemoService.class);

	public DemoDto getDemoDto() {
		LOG.debug("In getDemoDto()");
		DemoDto track = new DemoDto();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");
		return track;
	}
}
