package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data // Процессор аннотации сам сгенерирует геттеры и сеттеры
public class UserPojoFull{
	@JsonProperty("last_name") // Явно указываем имя ключа, которому соответствует переменная
	private String lastName;
	private int id;
	private String avatar;
	@JsonProperty("first_name")
	private String firstName;
	private String email;
}
