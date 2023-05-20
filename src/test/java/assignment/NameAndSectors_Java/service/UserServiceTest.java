package assignment.NameAndSectors_Java.service;

import assignment.NameAndSectors_Java.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import assignment.NameAndSectors_Java.entity.User;

    public class UserServiceTest {

        @Mock
        private UserRepository userRepository;

        private UserService userService;

        @BeforeEach
        public void setup() {
            MockitoAnnotations.openMocks(this);
            userService = new UserService(userRepository);
        }

        @Test
        public void testExistsByName() {
            User user = new User();
            user.setName("John Doe");

            Mockito.when(userRepository.existsByName("John Doe")).thenReturn(true);
            Mockito.when(userRepository.existsByName("Jane Smith")).thenReturn(false);

            Assertions.assertTrue(userService.existsByName("John Doe"));
            Assertions.assertFalse(userService.existsByName("Jane Smith"));
        }

        @Test
        public void testSaveUser() {
            User user = new User();
            user.setName("John Doe");

            Mockito.when(userRepository.save(user)).thenReturn(user);

            User savedUser = userService.saveUser(user);
            Assertions.assertEquals(user, savedUser);
        }

}
