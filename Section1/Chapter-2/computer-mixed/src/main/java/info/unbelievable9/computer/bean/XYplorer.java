package info.unbelievable9.computer.bean;

import info.unbelievable9.computer.Software;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/22
 * Author     : Unbelievable9
 **/
@Component
public class XYplorer implements Software {

    private String name;
    private String version;
    private List<String> featureList;

    public XYplorer(String name, String version, List<String> featureList) {
        this.name = name;
        this.version = version;
        this.featureList = featureList;
    }

    @Override
    public void start() {
        System.out.println(name + "(" + version + ") is Loading.");

        for (String feature :
                featureList) {
            System.out.println(feature);
        }
    }
}
