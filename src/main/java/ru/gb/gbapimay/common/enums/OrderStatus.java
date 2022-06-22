package ru.gb.gbapimay.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Artem Kropotov
 * created at 22.06.2022
 **/
@RequiredArgsConstructor
@Getter
public enum OrderStatus {

    CREATED("Создан"),
    DELIVERED("Доставлен"),
    RECEIVED("Получен"),
    CANCELED("Отменем"),
    PROCESSING("В обработке");

    private final String status;
}
