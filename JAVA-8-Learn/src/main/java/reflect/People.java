package main.java.reflect;

import lombok.*;

import java.io.Serializable;

/**
 * @author qingchen
 * @date 28/2/2023 下午 2:06
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class People implements Serializable {

    /**
     * id
     */
    protected Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;
}
