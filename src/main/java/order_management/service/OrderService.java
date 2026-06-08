package order_management.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import order_management.entity.Order;
import order_management.enums.OrderStatus;
import order_management.repository.OrderRepository;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    public Order create(Order order) {

    order.setStatus(OrderStatus.PENDIENTE);

    order.setCreatedAt(LocalDateTime.now());

    return repository.save(order);
}

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido no encontrado"));
    }

    public Order updateStatus(Long id, OrderStatus status) {

        Order order = findById(id);

        order.setStatus(status);

        return repository.save(order);
    }

}