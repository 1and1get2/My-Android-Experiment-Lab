package com.derek.ormlitetext1;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by derek on 1/08/15.
 */
@DatabaseTable(tableName = "accounts")
public class Account {
    private static final String TAG = Account.class.getSimpleName();

    @DatabaseField(id = true)
    private String name;
    @DatabaseField
    private String password;
    @DatabaseField
    private String whoAmI;
    @DatabaseField
    private Date date;

    public Account() {
        // ORMLite needs a no-arg constructor
    }
    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getWhoAmI() {
        return whoAmI;
    }

    public void setWhoAmI(String whoAmI) {
        this.whoAmI = whoAmI;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
