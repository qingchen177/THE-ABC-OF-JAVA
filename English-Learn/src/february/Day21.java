package february;

import lombok.Getter;

/**
 * @author qingchen
 * @date 21/2/2023 下午 5:12
 */

@Getter
public enum Day21 {
    neutrality(1,"中立 n."),
    reflective(2,"反射的；深思熟虑的"),
    displace(3,"取代"),
    chaos(4,"混乱"),
    definite(5,"肯定的"),
    pause(6,"暂停"),
    lounge(7,"休息室"),
    administration(8,"管理，政府"),
    guard(9,"保护"),
    dominated(10,"主宰"),
    slim(11,"苗条的"),
    compartment(12,"车厢，隔间"),
    cognitive(13,"认知的"),
    clarify(14,"澄清，明确"),
    genuine(15,"真的，由衷的"),
    regarding(16,"关于"),
    species(17,"物种"),
    defy(18,"违背"),
    convince(19,"使相信"),
    worldwide(20,"世界范围的")
    ;

    private Integer code;
    private String translation;

    Day21(Integer code, String translation) {
        this.code = code;
        this.translation = translation;
    }
}
