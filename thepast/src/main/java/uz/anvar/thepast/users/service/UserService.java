package uz.anvar.thepast.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.anvar.thepast.users.dto.UserDto;
import uz.anvar.thepast.users.model.User;
import uz.anvar.thepast.users.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDto getId(Integer id) {
        User entity = checkId(id);
        UserDto dto = new UserDto();
        convertEntityToDto(entity,dto);
        return dto;
    }

    private void convertEntityToDto(User entity, UserDto dto) {
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPassword(entity.getPassword());
        dto.setSurname(entity.getSurname());
        dto.setUsername(entity.getUsername());
        dto.setRole(entity.getRole());

    }

    private User checkId(Integer id) {
        Optional<User> optional =repository.findById(id);
        if (optional.isEmpty()){
            throw new  IllegalArgumentException("User not found");
        }
        return optional.get();

    }

    public UserDto postUser(UserDto dto) {
        User entity = new User();
        entity.setName(dto.getName());
        entity.setPassword(dto.getPassword());
        entity.setUsername(dto.getUsername());
        entity.setSurname(dto.getSurname());
        repository.save(entity);
        return dto;
    }
}
