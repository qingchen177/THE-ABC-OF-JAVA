package march;


import lombok.Getter;

/**
 * @author qingchen
 * @date 2/3/2023 下午 17：14
 */

@Getter
public enum Day2 {

    evolve(1, "进化"),
    intervention(2, "干涉"),
    diversion(3, "转移；娱乐"),
    materialize(4, "实现"),
    qualification(5, "资格"),
    biochemistry(6, "生物化学"),
    magnify(7, "放大"),
    intelligent(8, "聪明的"),
    predict(9, "预测"),
    harness(10, "管理，控制"),
    track(11, "追踪，轨迹"),
    lawn(12, "草坪"),
    rebellion(13, "叛逆"),
    accountable(14, "有负责任的"),
    currency(15, "货币"),
    imprison(16, "在监禁的"),
    humorous(17, "幽默的"),
    inaction(18, "不作为"),
    virtual(19, "虚拟的"),
    humanistic(20, "人文的")
    ;

    private Integer code;
    private String translation;

    Day2(Integer code, String translation) {
        this.code = code;
        this.translation = translation;
    }

}
