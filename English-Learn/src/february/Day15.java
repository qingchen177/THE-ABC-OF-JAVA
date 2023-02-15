package february;

import lombok.Getter;
/**
 * @author qingchen
 * @date 15/2/2023 下午 1:13
 */
@Getter
public enum Day15 {

    donor(1,"捐赠"),
    handle(2,"把手"),
    discipline(3,"学科;纪律"),
    responsibility(4,"责任"),
    apartment(5,"公寓"),
    clause(6,"条款"),
    bias(7,"偏见"),
    inherit(8,"继承"),
    irrelevant(9,"无关的"),
    redefined(10,"重新定义"),
    overturn(11,"推翻"),
    yield(12,"产生"),
    variance(13,"不同"),
    absolutely(14,"当然 adv."),
    destination(15,"目的地"),
    testify(16,"证明"),
    abuse(17,"虐待；滥用"),
    worship(18,"崇拜，喜爱"),
    lack(19,"缺少"),
    flexible(20,"灵活的"),
    descriptive(21,"描写的"),
    inquire(22,"询问"),
    enviable(23,"值得羡慕的"),
    alien(24,"陌生的；外星人"),
    provoke(25,"激怒"),
    cautious(26,"谨慎的"),
    desperate(27,"绝望的"),
    bureaucracy(28,"官僚主义"),
    philosopher(29,"哲学家"),
    biodiversity(30,"生物多样性"),
    tap(31,"轻敲，导出"),
    achieve(32,"实现"),
    foster(33,"培养，促进"),
    trait(34,"特质"),
    certify(35,"证明,保证"),
    deliberate(36,"故意的"),
    deliver(37,"传送"),
    subtle(38,"微妙的"),
    tutor(39,"辅导"),
    remarkable(40,"杰出的"),
    eloquent(41,"雄辩的"),
    imitate(42,"模仿"),

    ;

    private Integer code;
    private String cn;

    Day15(Integer code, String cn) {
        this.code = code;
        this.cn = cn;
    }
}
