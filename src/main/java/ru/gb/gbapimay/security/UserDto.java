package ru.gb.gbapimay.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Artem Kropotov
 * created at 01.06.2022
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    @JsonIgnore
    private Long id;

    @NotBlank
    @Size(min = 3, message = "username length must be grater than 3 symbols")
    private String username;
    @NotBlank
    @Size(min = 8, message = "password length must be grater than 8 symbols")
    private String password;
    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;
    @Email
    @NotBlank
    private String email;
    @NotBlank
    @Size(min = 5)
    private String phone;
}
