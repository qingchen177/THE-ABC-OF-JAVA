package march;


import lombok.Getter;

/**
 * @author qingchen
 * @date 1/3/2023 上午 9:12
 */

@Getter
public enum Day1 {

    bother(1, "困扰"),
    alleviate(2, "减轻，缓解"),
    presentation(3, "展示，讲话"),
    worldly(4, "世间的，尘世的"),
    peer(5, "同龄人"),
    endless(6, "无限的"),
    dilute(7, "稀释，冲淡"),
    jury(8, "陪审团"),
    index(9, "指数"),
    trap(10, "捕捉"),
    jail(11, "监狱"),
    divert(12, "转移"),
    authorization(13, "授权"),
    perspective(14, "视角，观点"),
    distinctive(15, "与众不同的"),
    glamorous(16, "有魅力的，迷人的"),
    association(17, "联系"),
    sympathetic(18, "同情的"),
    prominent(19, "卓越的"),
    humanistic(20, "人文的")
    ;

    private Integer code;
    private String translation;

    Day1(Integer code, String translation) {
        this.code = code;
        this.translation = translation;
    }

}
