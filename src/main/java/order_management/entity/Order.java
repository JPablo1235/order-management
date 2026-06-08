package order_management.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

import order_management.enums.OrderStatus;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String productName;

    private Integer quantity;

    private String shippingAddress;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    private LocalDateTime createdAt;
}