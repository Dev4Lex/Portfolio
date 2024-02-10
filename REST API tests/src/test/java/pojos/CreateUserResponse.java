package pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import utils.DateDeserializer;

import java.time.LocalDateTime;

@Data
public class CreateUserResponse extends UserRequest {
    private int id;
    // Преобразовываем дату в String и задаем формат "год-месяц-день-буква-часы-минуты-секунды-миллисекунды-таймзона"
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSZ")
    // Указываем созданный класс десериализации даты в соответствующей аннотации
    @JsonDeserialize(using = DateDeserializer.class)
    private LocalDateTime createdAt;

}
