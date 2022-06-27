package ru.gb.gbapimay.product.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import ru.gb.gbapimay.category.dto.CategoryDto;
import ru.gb.gbapimay.common.enums.Status;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    private Long id;
    @NotBlank
    private String title;
    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    @Digits(integer = 6, fraction = 2)
    private BigDecimal cost;
    @PastOrPresent
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate manufactureDate;
    @NotNull
    private Status status;
    private String manufacturer;
    private Set<CategoryDto> categories;
}
