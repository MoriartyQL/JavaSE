package com.learn.OBJECT;

/*
    equal()的使用介绍

    1.在java.lang.Object中定义
        创建Object子类的对象，在子类没有重写Object方法的equals()方法。比较的依旧是地址

    2.像String Data File 包装类等类， 都重写了Object类的Equals()，比较对象的实体

    3.在开发中，在自定义类，往往也需比较两个对象的实体内容是否相等



    区分 == 和equal()
    1. == 的使用
    在基本数据类型中中国，比较两个值是否相等 数据类型要相等  或可以类型提升
    使用在引用数据类型，则比比较两个地址是否相等
    2.equals()，只能使用在引用数据类型上。



 */

import java.util.Objects;

public class EqualTest {

    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();

        Object obj = u1;   //有子父类关系
        System.out.println(obj == u1);

        EqualTest t1 = new EqualTest();
        t1.testEqual();
    }

    public void testEqual(){
        User u1 = new User();
        User u2 = new User();
        u1.setAge(10);
        u2.setAge(10);
        u1.setName("lihua");
        u2.setName("lihua");
        System.out.println(u1.equals(u2));
    }

}
class User{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {   //自动生成的equls写法
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() && getName().equals(user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

//    public boolean equals(Object obj) {   //重写Objcet的equals方法
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof User) {
//            User u1 = (User) obj;  //类型转换前要用 instanceof 判断能否转化
//            if (u1.age == this.age) {
//                if (this.name == u1.name) {
//                    return true;
//                }
//            }
//        }
//            return false;
//    }
}

