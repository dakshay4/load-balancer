package com.dakshay;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobinStrategy implements LoadBalancerStrategy{


    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public LoadBalanceResource getResource(List<LoadBalanceResource> loadBalanceResources) {
        int index = count.getAndIncrement();
        if(index>=loadBalanceResources.size()) count =new AtomicInteger(0);
        return  loadBalanceResources.get(index);
    }
}
