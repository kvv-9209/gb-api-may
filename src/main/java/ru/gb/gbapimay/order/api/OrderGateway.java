package ru.gb.gbapimay.order.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.gb.gbapimay.order.dto.OrderDto;

import java.util.List;

/**
 * @author Artem Kropotov
 * created at 27.05.2022
 **/
public interface OrderGateway {
    @GetMapping
    List<OrderDto> getOrderList();

    @GetMapping("/{orderId}")
    ResponseEntity<OrderDto> getOrder(@PathVariable("orderId") Long id);

    @PostMapping
    ResponseEntity<OrderDto> handlePost(@Validated @RequestBody OrderDto orderDto);

    @PutMapping("/{orderId}")
    ResponseEntity<OrderDto> handleUpdate(@PathVariable("orderId") Long id,
                                          @Validated @RequestBody OrderDto orderDto);

    @DeleteMapping("/{orderId}")
    void deleteById(@PathVariable("orderId") Long id);
}
