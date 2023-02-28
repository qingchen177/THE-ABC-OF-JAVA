package main.java.reflect;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * @author qingchen
 * @date 28/2/2023 下午 2:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Coder extends People{

    /**
     * 公司
     */
    private String company;

    /**
     * 司龄
     */
    private Integer year;

    public void coding(){
        System.out.println("I am coding here" + company);

    }
}
