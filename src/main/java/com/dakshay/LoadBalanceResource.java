package com.dakshay;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoadBalanceResource {

    private final String ip;
    @Builder.Default()
    private final int weight = null;


}
