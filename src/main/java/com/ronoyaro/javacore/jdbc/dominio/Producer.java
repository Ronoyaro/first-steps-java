package com.ronoyaro.javacore.jdbc.dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {
    //Mapeamento da nossa entidade do banco
    private Integer id;
    private String name;
}
