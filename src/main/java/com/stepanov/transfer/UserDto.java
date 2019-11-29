package com.stepanov.transfer;

import com.stepanov.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
// Класс для отправки пользователя на необходимую страницу
public class UserDto {
    private String firstName;
    private String lastName;

    public static UserDto from(User user){
        return UserDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }
}
