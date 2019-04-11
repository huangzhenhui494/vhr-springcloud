package com.hzh.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
@Accessors(chain = true)
@Data
public class Employee implements Serializable {
    private Integer id;

    private String name;

    private String gender;

    private Date birthday;

    private String idcard;

    private String wedlock;

    private Integer nationid;

    private String nativeplace;

    private Integer politicid;

    private String email;

    private String phone;

    private String address;

    private Integer departmentid;

    private Integer joblevelid;

    private Integer posid;

    private String engageform;

    private String tiptopdegree;

    private String specialty;

    private String school;

    private Date begindate;

    private String workstate;

    private String workid;

    private Double contractterm;

    private Date conversiontime;

    private Date notworkdate;

    private Date begincontract;

    private Date endcontract;

    private Integer workage;


}