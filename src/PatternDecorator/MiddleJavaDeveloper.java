package PatternDecorator;

public class MiddleJavaDeveloper extends DeveloperDecorator{
    public MiddleJavaDeveloper(Developer developer) {
        super(developer);
    }
    public String writeGoodCode(){
        return "Im write good code ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + writeGoodCode();
    }
}
