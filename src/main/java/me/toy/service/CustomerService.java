package me.toy.service;

import me.toy.helper.DatabaseHelper;
import me.toy.model.CustomerEntity;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

/**
 * 客户Service
 *
 * Created by cc on 16/4/18.
 */
public class CustomerService {

    public boolean addCustomer(Map<String, Object> fieldMap) {
        //
        return false;
    }

    public boolean deleteCustomer(Integer customerId) {
        //
        return false;
    }

    public boolean updateCustomer(Integer customerId, Map<String, Object> fieldMap) {
        //
        return false;
    }

    public List<CustomerEntity> getCustomerList(String keyWord) {
        //
        return null;
    }

    public List<CustomerEntity> getCustomerList() {
        Connection conn = DatabaseHelper.getConnection();

        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(CustomerEntity.class, sql);
    }

    public CustomerEntity getCustomerDetail(Integer customerId) {
        //
        return null;
    }
}
