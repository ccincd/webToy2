package me.toy.test;

import me.toy.service.CustomerService;

/**
 * 单元测试
 *
 * Created by cc on 16/4/18.
 */
public class UnitTest {

    private final CustomerService customerService;

    public UnitTest() {
        this.customerService = new CustomerService();
    }
}
