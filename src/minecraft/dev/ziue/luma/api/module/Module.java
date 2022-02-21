package dev.ziue.luma.api.module;

public class Module {

    public String name;

    protected boolean toggled;

    private Category category;
    private int keyBind;

    public void onModEnable() {

    }

    public void onModDisable() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKeyBind() {
        return keyBind;
    }

    public void setKeyBind(int keyBind) {
        this.keyBind = keyBind;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isToggled() {
        return toggled;
    }

    public void toggle() {
        toggled = !toggled;
        if(toggled) {
            onModEnable();
        } else {
            onModDisable();
        }
    }

    public void setToggled(boolean toggle) {
        this.toggle();
        if(toggle) {
            onModEnable();
            toggled = true;
        } else {
            onModDisable();
            toggled = false;
        }
    }

}
