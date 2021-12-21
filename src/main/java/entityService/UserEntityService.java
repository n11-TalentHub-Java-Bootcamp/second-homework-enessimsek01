package entityService;

import dao.UserDao;
import dto.UserDto;
import dto.UserRegisterDto;
import dto.UserUpdateDto;
import entity.User;
import exception.UserNotFoundException;
import exception.UsernamePhoneNotMatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserEntityService {
    @Autowired
    private UserDao userDao;

    public List<UserDto> findAll() {
        return INSTANCE.convertUserListToUserDtoList(userDao.findAll());
    }

    public User findUserById(Long id) {
        return userDao.findUserById(id);
    }

    public UserDto findUserByUsername(String username) {

        return INSTANCE.convertUserToUserDto(userDao.findUserByUsername(username)); // TODO: olmayan kullanıcı olduğunda hata döndürsün
    }

    public UserDto findUserByCellPhone(String phone) {
        return INSTANCE.convertUserToUserDto(userDao.findUserByCellPhone(phone));

    }

    public UserDto save(UserRegisterDto userRegisterDto) {
        //1 dto yu entity çevir
        User user = INSTANCE.convertUserRegisterDtoToUser(userRegisterDto);
        // 2 entity save et sana entity geri dönecek
        user = userDao.save(user);
        // 3. dönen entity'i dto çevir return et
        UserDto userDto = INSTANCE.convertUserToUserDto(user);
        return userDto;
    }

    public void deleteByUsernameAndPhone(String username, String phone) {
        User userByUserName = userDao.findUserByUsername(username);
        if (userByUserName.getCellPhone() != phone) {

            throw new UsernamePhoneNotMatchException(userByUserName.getUsername() + " username " + phone + " and phone dont match.");
        }
        userDao.delete(userByUserName);
    }

    public UserDto updateUserByUserUpdateDto(UserUpdateDto userUpdateDto) {
        Optional<User> userById = userDao.findById(userUpdateDto.getId());
        if (!userById.isPresent())
            throw new UserNotFoundException(userUpdateDto.getId() + " no user.");
        User updatedUser = INSTANCE.convertUserUpdateDtoToUser(userUpdateDto);
        updatedUser.setUsername(userById.get().getUsername());
        User savedUser = userDao.save(updatedUser);
        return INSTANCE.convertUserToUserDto(savedUser);
    }
}
