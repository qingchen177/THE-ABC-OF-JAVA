package february;

import lombok.Getter;

/**
 * @author qingchen
 * @date 16/2/2023 上午 9:36
 */
@Getter
public enum Day16 {

    elevate(1,"提升；使高兴"),
    curb(2,"限制，控制"),
    consumption(3,"消耗"),
    brilliant(4,"极好的，才华横溢的"),
    adventure(5,"冒险"),
    needy(6,"贫穷的"),
    uneven(7,"不均衡的"),
    pose(8,"形成"),
    democracy(9,"民主 n."),
    rigid(10,"严格的"),
    slavery(11,"奴隶制度"),
    revolutionize(12,"革命化"),
    quicken(13,"加快"),
    underestimate(14,"低估"),
    strap(15,"用带帮助"),
    reluctance(16,"勉强"),
    convincing(17,"令人信服的"),
    perception(18,"看法，意识")
    ;

    private int code;
    private String translation;

    Day16(int code, String translation) {
        this.translation = translation;
        this.code = code;

    }
}
