package TestPackageAllow.Users;

import TestPackageAllow.CanUseSite;
import TestPackageAllow.DeveloperCompany.Site;

public class User implements CanUseSite {
    @Override
    public void useSite(Site site) {
        site.StandartUse();
    }
}
