package february;

import lombok.Getter;

/**
 * @author qingchen
 * @date 13/2/2023 下午 5:04
 */
@Getter
public enum Day14 {

        democratic(1, "民主的 adj."),
        invent(2,"发明；虚构 v."),
        infinite(3,"无限的 adj."),
        impart(4,"通知；传授 v."),
        agony(5,"极大的痛苦（精神上或者肉体上）"),
        infectious(6,"传染性的 adj."),
        attract(7,"吸引注意；引起 v."),
        legitimate(8,"合法的，合理的 adj."),
        vocation(9,"职业 n."),
        solid(10,"固体；坚固的，固体的 n. adj."),
        assignment(11,"分配，指派；作业，任务 n."),
        inspire(12,"鼓舞；激起灵感"),
        accept(13,"接受"),
        specify(14,"指定，详细说明"),
        furnace(15,"炉子，熔炉"),
        spirit(16,"精神；酒精"),
        elevator(17,"电梯"),
        summon(18,"召唤；鼓起（勇气）"),
        attractive(19,"吸引人的 adj."),
        barrel(20,"桶；枪管"),
        caresss(21,"爱抚，抚摸"),
        herb(22,"草药；香草，草本植物"),
        dilemma(23,"困境，进退两难"),

        ;

        private int num;
        private String translation;

    Day14(int num, String translation) {
            this.num = num;
            this.translation = translation;
        }


}
