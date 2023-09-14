import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Conditioner {
    private int id;
    private String name;
    private int maxTemperature ;
    private int minTemperature ;
    private int currentTemperature ;

}