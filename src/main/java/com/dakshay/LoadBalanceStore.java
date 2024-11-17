package com.dakshay;

import java.util.List;
import java.util.Map;

public class LoadBalanceStore {

    private static LoadBalanceStore instance;
    private Map<String, LoadBalancer>  data;


    private LoadBalanceStore() {
    }

    public static LoadBalanceStore getInstance(){
        if(instance == null) {
            instance = new LoadBalanceStore();
        }
        return instance;
    }


    public void save(LoadBalancer loadBalancer) {
        data.put(loadBalancer.getId(), loadBalancer);
    }

    public LoadBalancer findById(String id) {
        return data.get(id);
    }

    public List<LoadBalancer> findAll() {
        return (List<LoadBalancer>) data.values();
    }


}
