package test.java.space.scitech.configuration;

import java.util.List;

@SuppressWarnings("unused")
public class Config {
    private String start_url;
    private List<TestUser> testUsers;
    private boolean headless;
    private int browser_width;
    private int browser_height;

    // Getters and Setters
    public String getStart_url() {
        return start_url;
    }

    public void setStart_url(String start_url) {
        this.start_url = start_url;
    }

    public List<TestUser> getTestUsers() {
        return testUsers;
    }

    public void setTestUsers(List<TestUser> testUsers) {
        this.testUsers = testUsers;
    }

    public boolean isHeadless() {
        return headless;
    }

    public void setHeadless(boolean headless) {
        this.headless = headless;
    }

    public int getBrowser_width() {
        return browser_width;
    }

    public void setBrowser_width(int browser_width) {
        this.browser_width = browser_width;
    }

    public int getBrowser_height() {
        return browser_height;
    }

    public void setBrowser_height(int browser_height) {
        this.browser_height = browser_height;
    }
}
