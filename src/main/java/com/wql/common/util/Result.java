package com.wql.common.util;

/**
 * <strong>
 * Desc: 统一返回对象
 * </strong>
 * <p>Author: weiqilong<p>
 * Create Time:2019/4/24 22:28<p>
 */
public class Result {
    private int code;
    private String msg;
    private Object data;
    //成功code
    private static final int SUCCESS_CODE = 2000;
    //错误code
    private static final int ERROR_CODE = 4000;


    private Result(){

    }

    private Result(int code,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result success(){
        return new Result(SUCCESS_CODE,"","");
    }

    public static Result success(String msg,Object data){
        return new Result(SUCCESS_CODE,msg,data);
    }

    public static Result success(String msg){
        return new Result(SUCCESS_CODE,msg,"");
    }

    public static Result success(Object data){
        return new Result(SUCCESS_CODE,"",data);
    }

    public static Result error(){
        return new Result(ERROR_CODE,"","");
    }

    public static Result error(String msg,Object data){
        return new Result(ERROR_CODE,msg,data);
    }

    public static Result error(String msg){
        return new Result(ERROR_CODE,msg,"");
    }

    public static Result error(Object data){
        return new Result(ERROR_CODE,"",data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
