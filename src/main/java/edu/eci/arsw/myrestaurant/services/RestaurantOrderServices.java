/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.myrestaurant.services;

import edu.eci.arsw.myrestaurant.model.Order;
import edu.eci.arsw.myrestaurant.model.RestaurantProduct;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author hcadavid
 */
public interface RestaurantOrderServices {

    
    
    
    void addNewOrderToTable(Order o) throws OrderServicesException;

    int calculateTableBill(int tableNumber) throws OrderServicesException;

    Set<String> getAvailableProductNames();

    RestaurantProduct getProductByName(String product) throws OrderServicesException;

    Order getTableOrder(@PathVariable int tableNumber);

    Set<Integer> getTablesWithOrders();

    void releaseTable(int tableNumber) throws OrderServicesException;
    
    //List<String> getName();
    public Map<Integer, Order> getTableOders();
    
    
}
