package TestPackageAllow.DeveloperCompany;

public class Developer{
    String typeOfUser = "DEVELOPER";

    public void useSite(Site site) {
        System.out.print(typeOfUser + ": ");
        site.SecretUse();

        System.out.print(typeOfUser + ": ");
        site.StandartUse();
    }
}
