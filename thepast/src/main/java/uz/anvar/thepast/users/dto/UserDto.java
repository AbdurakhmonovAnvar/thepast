package uz.anvar.thepast.users.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private Integer id;

    private String name;

    private String surname;

    private String username;

    private String password;

    private String role;

    private boolean status;
}
