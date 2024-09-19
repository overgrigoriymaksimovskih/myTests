package TestPackageAllow.DeveloperCompany;

public class Site {
    private String standartUse = "Standart use";
    private String secretUse = "Secret use";

    public void StandartUse(){
        System.out.println(standartUse);
    }

    protected void SecretUse(){
        System.out.println(secretUse);
    }
}
