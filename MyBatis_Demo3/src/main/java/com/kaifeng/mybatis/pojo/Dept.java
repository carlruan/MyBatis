package com.kaifeng.mybatis.pojo;

public class Dept {
    private Integer did;
    private String deptName;

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", deptName=" + deptName +
                '}';
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Dept(Integer did, String deptName) {
        this.did = did;
        this.deptName = deptName;
    }

    public Dept() {
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
