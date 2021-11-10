package model;

import java.io.Serializable;

public class ObjectWrapper  implements Serializable{
    private static final long serialVersionUID = 20210811011L;
    public static final int LOGIN_USER = 1;
    public static final int REPLY_LOGIN_USER = 2;
    public static final int ONLINE_PLAYER = 3;
    public static final int REPLY_ONLINE_PLAYER = 4;
    public static final int ADD_FRIEND = 5;
    public static final int REPLY_ADD_FRIEND = 6;
    public static final int FRIEND_REQUEST = 7;
    public static final int REPLY_FRIEND_REQUEST = 8;
    public static final int SERVER_INFORM_CLIENT_NUMBER = 9;
    public static final int LOGOUT_USER = 10;
    public static final int REPLY_LOGOUT_USER = 11;
    public static final int FRIEND_LIST = 12;
    public static final int REPLY_FRIEND_LIST = 13;
    public static final int SIGNUP_USER = 14;
    public static final int REPLY_SIGNUP_USER = 15;
    public static final int RANK = 16;
    public static final int REPLY_RANK = 17;
    public static final int ACCEPT_FRIEND = 18;
    public static final int REPLY_ACCEPT_FRIEND = 19;

    private int performative;
    private Object data;
    public ObjectWrapper() {
        super();
    }
    public ObjectWrapper(int performative, Object data) {
        super();
        this.performative = performative;
        this.data = data;
    }
    public int getPerformative() {
        return performative;
    }
    public void setPerformative(int performative) {
        this.performative = performative;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}