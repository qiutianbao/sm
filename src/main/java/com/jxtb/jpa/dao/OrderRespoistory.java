package com.jxtb.jpa.dao;

import com.jxtb.jpa.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRespoistory extends JpaRepository<Order, Long>{

}
