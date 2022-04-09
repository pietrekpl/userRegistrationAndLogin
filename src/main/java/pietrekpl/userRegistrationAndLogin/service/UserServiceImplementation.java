package pietrekpl.userRegistrationAndLogin.service;


import org.springframework.stereotype.Service;
import pietrekpl.userRegistrationAndLogin.dto.UserRegistrationDto;
import pietrekpl.userRegistrationAndLogin.model.Role;
import pietrekpl.userRegistrationAndLogin.model.User;
import pietrekpl.userRegistrationAndLogin.repository.UserRepository;

import java.util.Arrays;

@Service
public class UserServiceImplementation implements UserService {


    private UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(), registrationDto.getPassword(),
                Arrays.asList(new Role("ROLE_USER")));

        return  userRepository.save(user);
    }
}
