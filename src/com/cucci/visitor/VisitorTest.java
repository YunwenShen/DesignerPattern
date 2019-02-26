package com.cucci.visitor;

/**
 * 访问者模式测试类
 *
 * @author shenyw
 **/
public class VisitorTest {

    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Success());

        Man man = new Man();
        Woman woman = new Woman();

        structure.accept(man);
        structure.accept(woman);

        // 访问者模式，表示一个作用于某对象结构中的各元素的操作。他是你可以在不改变各元素的类
        // 的前提下定义作用于这些元素的新操作
    }
}
