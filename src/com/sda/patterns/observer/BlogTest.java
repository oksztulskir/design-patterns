package com.sda.patterns.observer;

/**
 */
public class BlogTest {
    public static void main(String[] args) {
        Observer reader1 = new Reader("Reader 1");
        Observer reader2 = new Reader("Reader 2");
        Observer reader3 = new Reader("Reader 3");

        Observable blog = new Blog();
        blog.attach(reader1);
        blog.attach(reader2);
        blog.publish("Article 1");
        blog.attach(reader3);
        blog.publish("Article 2");
        blog.detach(reader1);
        blog.publish("Article 3");

    }
}
