package com.soft.common;


public class R {
    private Boolean flag;
    private Object data;
    private String msg;
    private String code;
    private int icon;
    private int anim;

    public int getAnim() {
        return anim;
    }

    public void setAnim(int anim) {
        this.anim = anim;
    }



    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



    @Override
    public String toString() {
        return "R{" +
                "flag=" + flag +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public R(){}

    public R(Boolean flag){
        this.flag = flag;
    }

    public R(Boolean flag, Object data){
        this.flag = flag;
        this.data = data;
    }
    public R(String msg, String code,int icon){
        this.msg = msg;
        this.code = code;
        this.icon = icon;
    }

    public R(String msg, String code,int icon,int anim){
        this.msg = msg;
        this.code = code;
        this.icon = icon;
        this.anim = anim;
    }

    public R(Boolean flag, String msg){
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg){
        this.flag = false;
        this.msg = msg;
    }
}
