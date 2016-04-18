package me.toy.service;

import me.toy.model.CustomerEntity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * 单元测试
 *
 * Created by cc on 16/4/18.
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAddCustomer() throws Exception {

    }

    @Test
    public void testDeleteCustomer() throws Exception {

    }

    @Test
    public void testUpdateCustomer() throws Exception {

    }

    @Test
    public void testGetCustomerList() throws Exception {
        List<CustomerEntity> customerEntities = customerService.getCustomerList();
        assertTrue(customerEntities.size() > 0);
        System.out.println(customerEntities);
    }

    @Test
    public void testGetCustomerList1() throws Exception {

    }

    @Test
    public void testGetCustomerDetail() throws Exception {

    }
}