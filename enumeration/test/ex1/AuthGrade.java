package enumeration.test.ex1;

public enum AuthGrade {
    GUEST(1, "guest"),
    LOGIN(2, "login user"),
    ADMIN(3, "administrator");

    private final int level;
    private final String description;

    private final String [] menus = {"main page", "email page", "admin page"};

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public void getScreen() {
        System.out.println("Your grade is "+getDescription());
        System.out.println("==menu list==");

        for(int i=0; i<getLevel(); i++) {
            System.out.println("-" + menus[i]);
        }

    }
}
