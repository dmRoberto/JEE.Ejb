package controllers.ejb;

import java.util.Date;

import javax.ejb.Singleton;

@Singleton
public class Util {
    private String id;

    public Util() {
        id = "" + new Date().getTime();
    }

    public String getId() {
        return id;
    }
}
