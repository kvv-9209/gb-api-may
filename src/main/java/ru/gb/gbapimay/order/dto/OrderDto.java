package ru.gb.gbapimay.order.dto;

import lombok.*;
import org.apache.tomcat.jni.Address;
import ru.gb.gbapimay.common.enums.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {

    private String recipientFirstname;
    private String recipientLastname;
    private String recipientPhone;
    private String recipientMail;
    private OrderStatus status;
    private LocalDate deliveryDate;
    private BigDecimal deliveryPrice;
    private Address deliveryAddress;
    private Address shopAddress;
//    private AccountUser accountUser; // todo дз 10 сделать user dto который будет храниться с заказом dto
//    private List<OrderItem> orderItems; // todo сделать orderItem dto который будет храниться с заказом dto
}
