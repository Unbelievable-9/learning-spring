package info.unbelievable9.computer.bean;

import info.unbelievable9.computer.Software;

import java.util.List;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/22
 * Author     : Unbelievable9
 **/
public class BlankExplorer implements Software {

    private String name;
    private String version;
    private List<String> featureList;

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setFeatureList(List<String> featureList) {
        this.featureList = featureList;
    }

    @Override
    public void start() {
        System.out.println(name + "(" + version + ") is Loading.");

        for (String feature:
             featureList) {
            System.out.println(feature);
        }
    }
}
