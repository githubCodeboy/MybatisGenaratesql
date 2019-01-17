package com.ayhealth.pojo;

public class DeptDocterRelation {
    private Integer id;

    private String deptCode;

    private String deptName;

    private String hosCode;

    private String hosName;

    private String docCode;

    private String checkMd5;

    private Integer workState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getHosCode() {
        return hosCode;
    }

    public void setHosCode(String hosCode) {
        this.hosCode = hosCode == null ? null : hosCode.trim();
    }

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName == null ? null : hosName.trim();
    }

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode == null ? null : docCode.trim();
    }

    public String getCheckMd5() {
        return checkMd5;
    }

    public void setCheckMd5(String checkMd5) {
        this.checkMd5 = checkMd5 == null ? null : checkMd5.trim();
    }

    public Integer getWorkState() {
        return workState;
    }

    public void setWorkState(Integer workState) {
        this.workState = workState;
    }
}