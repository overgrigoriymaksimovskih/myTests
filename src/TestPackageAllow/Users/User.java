package TestPackageAllow.Users;

import TestPackageAllow.DeveloperCompany.Site;

public class User {
    String typeOfUser = "SIMPLE USER";

    public void useSite(Site site) {
//        site.SecretUse();
        //user не может делать secretUse потому что он не в одном пакете с Site а метод secretUse - PROTECTED
        System.out.print(typeOfUser + ": ");
        site.StandartUse();
    }
}
