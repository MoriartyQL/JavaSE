package com.learn.Error;

public class ThrowTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.register(-10);
        System.out.println(s1.toString());
    }

}
class Student{
    private int id = 0;
    public void register(int id){
        if(id>0){
            this.id = id;
        }else{
//            throw new RuntimeException("传入id非法数据！");
            throw new MyException("传入非法的ID数据！");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
