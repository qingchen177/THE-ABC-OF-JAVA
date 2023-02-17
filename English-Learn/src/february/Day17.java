package february;

import lombok.Getter;

/**
 * @author qingchen
 * @date 17/2/2023 上午 10:03
 */
@Getter
public enum Day17 {

    guesstimate(1,"大概的"),
    underlying(2,"潜在的"),
    footnote(3,"注脚"),
    deficient(4,"缺失的"),
    memorized(5,"熟记"),
    prescribe(6,"开处方"),
    present(7,"呈现，给予"),
    awesome(8,"极好的"),
    outnumber(9,"超过"),
    lawsuit(10,"诉讼"),
    incalculable(11,"不可计算的"),
    slight(12,"轻微的"),
    irritate(13,"激怒"),
    amend(14,"修订"),
    fade(15,"退色"),
    tasteless(16,"没有味道的"),
    designate(17,"指定"),
    urbanization(18,"城市化"),
    compromise(19,"妥协"),
    expedition(20,"远征"),
    subtle(21,"微妙的")
    ;

    private Integer code;
    private String translation;

    Day17(Integer code, String translation) {
        this.code = code;
        this.translation = translation;

    }
}
