/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import javax.sql.DataSource;

/**
 *
 * @author Ketkee Aryamane
 */
public class BankAccountDao {
    
    private DataSource dataSource;

    public BankAccountDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    
    
}
