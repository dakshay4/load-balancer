package com.dakshay;

import java.util.List;

public interface LoadBalancerStrategy    {


    public LoadBalanceResource getResource(List<LoadBalanceResource> loadBalanceResources);
}
