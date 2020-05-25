package com.example.demo;


import java.util.Random;

public class User {
    private String name;
    private String quest;
    private String color;
    private String swallowVelocity;
    private boolean askColor;

    User(){
        setAskColor();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSwallowVelocity() {
        return swallowVelocity;
    }

    public void setSwallowVelocity(String swallowVelocity) {
        this.swallowVelocity = swallowVelocity;
    }

    public boolean getAskColor() {
        return this.askColor;
    }

    public void setAskColor() {
        Random random = new Random();
        this.askColor = random.nextBoolean();
    }
}
