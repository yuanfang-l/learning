package com.liu.Lambda;

public class TestLambda1 {

    //3.静态内部类
    static class Like2 implements ILike{
        @Override
        public void lambda() {
            System.out.println("输出的语句2");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda();
        like = new Like2();
        like.lambda();

        //4.局部内部类
        class Like3 implements ILike{
            @Override
            public void lambda() {
                System.out.println("输出语句3");
            }

        }
        like = new Like3();
        like.lambda();

        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("输出语句4");
            }
        };
        like.lambda();

        //6.用lambda简化
        like = ()->{
            System.out.println("输出语句6");
        };
        like.lambda();

    }


}




interface ILike{
    void lambda();
}

class Like implements ILike {
    @Override
    public void lambda() {
        System.out.println("输出的语句");
    }
}


