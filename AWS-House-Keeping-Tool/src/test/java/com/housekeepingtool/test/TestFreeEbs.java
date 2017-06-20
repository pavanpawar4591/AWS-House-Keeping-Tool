package com.housekeepingtool.test;

import org.junit.Test;

import com.awshousekeeping.services.AwsEBSResourceService;
import com.awshousekeeping.services.impl.AWSEBSResourceServiceImpl;

public class TestFreeEbs {

	private AwsEBSResourceService awsEBSResourceService = new AWSEBSResourceServiceImpl();

	@Test
	public void testfreeEbsResult() {
		System.out.println(awsEBSResourceService.getAllRegionsEBSVolume("0").toString());

	}
}
