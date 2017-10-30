package com.rtc.bean;

import java.util.HashSet;
import java.util.Set;

public class BaseQuestionBean {
    private int quesId;
    private String content;
    private String answer;
    private int flag;
    private String imagePath;
    private double accuracy;
    private int sovleNum;

    public static String[] SYMBOLS = {"^", "_", "\\sin", "\\cos", "\\frac", "\\sqrt","_"};

    private Set<String> symbols;

    public int getQuesId() {
        return quesId;
    }

    public void setQuesId(int quesId) {
        this.quesId = quesId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        symbols = new HashSet<>();
        for (String str : SYMBOLS) {
            if (content.indexOf(str) != -1)
                symbols.add(str);
        }
        this.content = content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public int getSovleNum() {
        return sovleNum;
    }

    public void setSovleNum(int sovleNum) {
        this.sovleNum = sovleNum;
    }

    public Set<String> getSymbols() {
        return symbols;
    }

    public void setSymbols(Set<String> symbols) {
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        return "BaseQuestionBean{" +
                "quesId='" + quesId + '\'' +
                ", content='" + content + '\'' +
                ", answer='" + answer + '\'' +
                ", flag=" + flag +
                ", imagePath='" + imagePath + '\'' +
                ", accuracy=" + accuracy +
                ", sovleNum=" + sovleNum +
                '}';
    }
}
