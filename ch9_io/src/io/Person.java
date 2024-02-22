package io;

import java.io.Serializable;

// java.io.NotSerializableException: io.Person

public class Person implements Serializable { // Serializable : 객체 상태로 주고 받을 수 있게 해주는 의미 (직렬화)

    private String name;
    private String job;
    private transient String tel; // transient : 직렬화 대상에서 제외

    public Person(String name, String job, String tel) {
        this.name = name;
        this.job = job;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Person [name = " + name + ", job = " + job + ", tel = " + tel + "]";
    }

}
