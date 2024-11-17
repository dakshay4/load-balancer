package com.dakshay;

import java.util.List;

public class RoundRobinWeightStrategy implements LoadBalancerStrategy {

    private final WeightOrder weightOrder;

    public RoundRobinWeightStrategy(WeightOrder weightOrder) {
        this.weightOrder = weightOrder;
    }

    @Override
    public LoadBalanceResource getResource(List<LoadBalanceResource> loadBalanceResources) {
        return null;
    }

    public enum WeightOrder {
        ASC, DESC
    }
}
