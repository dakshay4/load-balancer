package com.dakshay;

public class LoadBalancerMain {

    

    public final void test(
            LBRequest request) {
        LoadBalanceResource lbc1a = LoadBalanceResource.builder().ip("8.8.8.0").build();
        LoadBalanceResource lbc2a = LoadBalanceResource.builder().ip("8.8.8.1").build();

        LoadBalanceResource lbc1b = LoadBalanceResource.builder().ip("9.9.9.0").weight(10).build();
        LoadBalanceResource lbc2b = LoadBalanceResource.builder().ip("9.9.9.1").weight(3).build();
        LoadBalanceResource lbc3b = LoadBalanceResource.builder().ip("9.9.9.2").weight(20).build();

        LoadBalancer lb1 = LoadBalancerConnectionManager.create(new RoundRobinStrategy(), lbc1a, lbc2a);
        LoadBalancer lb2 = LoadBalancerConnectionManager.create(new RoundRobinWeightStrategy(), lbc1b, lbc2b);


        LoadBalanceStore.getInstance().save(lb1);
        LoadBalanceStore.getInstance().save(lb2);

        for(int i=0; i<10; i++) {
            LoadBalanceResource loadBalanceResourceAcquired1 = lb1.getResource();
            System.out.println("loadBalanceResourceAcquired : " + loadBalanceResourceAcquired1.getIp());
        }

        LoadBalanceResource loadBalanceResourceAcquired = lb2.getResource();


    }
}
