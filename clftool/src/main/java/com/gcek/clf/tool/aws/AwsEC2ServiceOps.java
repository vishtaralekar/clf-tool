package com.gcek.clf.tool.aws;

import java.util.List;

import com.amazonaws.services.ec2.model.Address;
import com.gcek.clf.tool.model.MySecurityGroup;
import com.gcek.clf.tool.utility.BusinessException;

public interface AwsEC2ServiceOps {

	public List<MySecurityGroup> getSecurityGroups() throws BusinessException;
	

	public List<Address> getPublicIp() throws BusinessException;
	

}
