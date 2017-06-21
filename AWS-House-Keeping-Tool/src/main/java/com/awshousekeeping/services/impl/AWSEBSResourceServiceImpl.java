/**
 * 
 */
package com.awshousekeeping.services.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.DescribeRegionsResult;
import com.amazonaws.services.ec2.model.DescribeVolumesRequest;
import com.amazonaws.services.ec2.model.DescribeVolumesResult;
import com.amazonaws.services.ec2.model.Filter;
import com.amazonaws.services.ec2.model.Region;
import com.amazonaws.services.ec2.model.Volume;
import com.awshousekeeping.services.AwsEBSResourceService;
import com.awshousekeeping.utils.AllAWSClientBuilder;

/**
 * @author Pavan.Pawar
 *
 */
public class AWSEBSResourceServiceImpl implements AwsEBSResourceService {

	static final Logger logger = Logger.getLogger(AWSEBSResourceServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.awshousekeeping.services.AwsEBSResourceService#getAllRegionsEBSVolume
	 * (java.lang.String)
	 */
	@Override
	public Map<String, List<Volume>> getAllRegionsEBSVolume(String accountid) {

		AmazonEC2 ec2 = AllAWSClientBuilder.getEc2Client(0);
		DescribeRegionsResult describeRegionsResult = ec2.describeRegions();

		List<Region> regionList = describeRegionsResult.getRegions();

		HashMap<String, List<Volume>> resultMap = new HashMap<>();
		for (Region r : regionList) {

			AmazonEC2ClientBuilder builder = AmazonEC2ClientBuilder.standard();

			builder.setEndpointConfiguration(new EndpointConfiguration(r.getEndpoint(), null));
			AmazonEC2 ec2clinet = builder.build();

			DescribeVolumesRequest descriveVolumeRequest= new DescribeVolumesRequest();
			Collection<Filter> filters =new  ArrayList<>();
			List<String> values =new ArrayList<>();
			values.add("available");
			Filter f =new Filter("status", values );
			
			filters.add(f);
			descriveVolumeRequest.setFilters(filters);
			DescribeVolumesResult describeVolumesResult = ec2clinet.describeVolumes(descriveVolumeRequest);

			resultMap.put(r.getRegionName(), describeVolumesResult.getVolumes());

		}

		return resultMap;

	}

}
