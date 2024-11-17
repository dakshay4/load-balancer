package com.dakshay;

import java.util.List;
import java.util.UUID;

public class LoadBalancer {

    private final String id;
    private final List<LoadBalanceResource> loadBalanceResources;
    private final LoadBalancerStrategy loadBalancerStrategy;


    public LoadBalancer(List<LoadBalanceResource> loadBalanceResources, LoadBalancerStrategy loadBalancerStrategy) {
        this.id = UUID.randomUUID().toString();
        this.loadBalanceResources = loadBalanceResources;
        this.loadBalancerStrategy = loadBalancerStrategy;
    }

    public String getId() {
        return id;
    }

    public List<LoadBalanceResource> getLoadBalanceResources() {
        return loadBalanceResources;
    }

    public LoadBalancerStrategy getLoadBalancerStrategy() {
        return loadBalancerStrategy;
    }

    public LoadBalanceResource getResource() {
        return loadBalancerStrategy.getResource(loadBalanceResources);
    }
}
