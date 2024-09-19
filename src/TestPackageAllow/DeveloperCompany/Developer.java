package TestPackageAllow.DeveloperCompany;

import TestPackageAllow.CanUseSite;

public class Developer implements CanUseSite {

    @Override
    public void useSite(Site site) {
        site.SecretUse();
        site.StandartUse();
    }
}
