package order_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import order_management.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}