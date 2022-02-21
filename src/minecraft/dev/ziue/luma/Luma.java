package dev.ziue.luma;

import dev.ziue.luma.api.Manager;

public class Luma {

    public static Luma INSTANCE = new Luma();

    public Manager manager = new Manager();

    public String clientName = "Luma";
    public String clientVersion = "0.0.1";
    public String clientBuild = "1";

    public void onInitialize() {
        INSTANCE = new Luma();
        manager = new Manager();
        manager.registerManagers();
    }

}
