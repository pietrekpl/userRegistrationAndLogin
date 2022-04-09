package pietrekpl.userRegistrationAndLogin.service;

import pietrekpl.userRegistrationAndLogin.dto.UserRegistrationDto;
import pietrekpl.userRegistrationAndLogin.model.User;

public interface UserService  {
    User save(UserRegistrationDto registrationDto);

}
