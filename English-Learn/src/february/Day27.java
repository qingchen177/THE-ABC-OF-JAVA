package february;

import lombok.Getter;

/**
 * @author qingchen
 * @date 27/2/2023 下午 5:10
 */

@Getter
public enum Day27 {

    dishonest(1,"不诚实的"),
    indicate(2,"表明"),
    considerable(3,"相当多的"),
    compel(4,"强迫"),
    chain(5,"连锁店"),
    majority(6,"大多数"),
    impart(7,"传授"),
    calculation(8,"计算"),
    incompetent(9,"不称职的"),
    distribution(10,"分配"),
    regime(11,"制度"),
    consultation(12,"商议"),
    exploit(13,"开发，开采"),
    expectation(14,"期望"),
    awkward(15,"尴尬的，棘手的，笨拙的"),
    quantifiable(16,"可量化的"),
    consistent(17,"一致的"),
    sponsor(18,"赞助商"),
    ;

    private Integer code;
    private String translation;

    Day27(Integer code, String translation) {
        this.code = code;
        this.translation = translation;

    }
}
