package com.awshousekeeping.utils;

import com.amazonaws.services.identitymanagement.AmazonIdentityManagement;
import com.amazonaws.services.identitymanagement.AmazonIdentityManagementClientBuilder;

public class AWSClientBuilder {

	public static AmazonIdentityManagement getIAMClient(int acountID) {

		// TODO read from user id get access key and secret keys

		String accessKey = "";
		String secretKey = "";
		return AmazonIdentityManagementClientBuilder.defaultClient();
	}
}
