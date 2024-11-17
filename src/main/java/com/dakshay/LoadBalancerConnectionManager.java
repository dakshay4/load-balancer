package com.dakshay;

import java.util.Arrays;

public class LoadBalancerConnectionManager {


    public static LoadBalancer create(LoadBalancerStrategy loadBalancerStrategy, LoadBalanceResource... args) {
        return new LoadBalancer(Arrays.stream(args).toList(), loadBalancerStrategy);

    }
}
