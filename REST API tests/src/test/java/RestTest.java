import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojos.UserRequest;
import pojos.CreateUserResponse;
import pojos.UserPojoFull;
import utils.RestWrapper;
import utils.UserGenerator;


import static org.assertj.core.api.Assertions.assertThat;

public class RestTest {

    // Создаем переменную класса с wrapper
    private static RestWrapper api;

    // Инициализируем wrapper, который будет выполняться перед всеми тестами
    @BeforeAll
    public static void prepareClient(){
        api = RestWrapper.loginAs("eve.holt@reqres.in","cityslicka");
    }

    @Test
    @DisplayName("Тест получения списка пользователей")
    public void getUsers(){
        // На вход передаем список пользователей из JSON, извлекаем email, проверяем на наличие почты
        assertThat(api.user.getUsers()).extracting(UserPojoFull::getEmail).contains("george.bluth@reqres.in");
    }
    @Test
    @DisplayName("Тест создания пользователя")
    public void createUser(){
        // Генерируем пользователя
        UserRequest rq = UserGenerator.getSimpleUser();
        CreateUserResponse rs = api.user.createUser(rq);

        // Проверяем: ответ не null; ответ соответствует имени в запросе
        assertThat(rs)
                .isNotNull()
                .extracting(CreateUserResponse::getName)
                .isEqualTo(rq.getName());

    }
}
