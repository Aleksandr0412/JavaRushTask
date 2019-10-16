package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive {
    private static int nextId = 0;
    protected int age;
    protected String name;
    protected Size size;
    private int id;
    private List<Human> children = new ArrayList<>();
    private BloodGroup bloodGroup;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = nextId;
        nextId++;
    }

    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void addChild(Human human) {
        this.children.add(human);
    }

    public void removeChild(Human human) {
        this.children.remove(human);
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

//    public void setBloodGroup(int code) {
//        if (code == 1 ) bloodGroup = BloodGroup.first();
//        if (code == 2 ) bloodGroup = BloodGroup.second();
//        if (code == 3 ) bloodGroup = BloodGroup.third();
//        if (code == 4 ) bloodGroup = BloodGroup.fourth();
//    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void live() {

    }

    public void printData() {
        System.out.println(getPosition() + ": " + name);
    }


    public String getPosition() {
        return "Человек";
    }

    public int getId() {
        return id;
    }

    public void printSize() {
        System.out.println("Рост: " + size.height + " Вес: " + size.weight);
    }

    public class Size {
        public int height;
        public int weight;
    }
}