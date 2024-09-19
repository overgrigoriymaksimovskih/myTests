package TestPackageAllow;

import TestPackageAllow.DeveloperCompany.Developer;
import TestPackageAllow.DeveloperCompany.Site;
import TestPackageAllow.Users.User;

public class Main {
    public static void main(String[] args) {
        Site site = new Site();
        User user = new User();
        Developer developer = new Developer();

        user.useSite(site);
        developer.useSite(site);
    }
}
