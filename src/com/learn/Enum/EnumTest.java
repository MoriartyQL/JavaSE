package com.learn.Enum;


import java.util.ArrayList;

/*
    枚举类
        定义：enum args ={
        常量列表}
 */
public class EnumTest {
    public static void main(String[] args) {
        Season[] seasons = Season.values();

        for(int i = 0;i<seasons.length;i++){
            System.out.println(seasons[i]);
        }

        Season s1 = Season.valueOf("STRING");
        System.out.println(s1);

        ArrayList list = new ArrayList();

    }

    public void say(){
        System.out.println("我是枚举类");
    }

    enum Season{
        STRING("春天","天气好"),
        SUMMER("夏天","太阳大"),
        AUTUMN("秋天","天气凉爽"),
        WINTER("冬天","冷");
        private final String SEASON_NAME;
        private final String SEASON_DESC;


        private Season(String SEASON_NAME,String SEASON_DESC){
            this.SEASON_DESC = SEASON_DESC;
            this.SEASON_NAME = SEASON_NAME;
        }


        @Override
        public String toString() {
            return "Season{" +
                    "SEASON_NAME='" + SEASON_NAME + '\'' +
                    ", SEASON_DESC='" + SEASON_DESC + '\'' +
                    '}';
        }
    }

}


