package PatternFactoryMethod;

public class Program {
    static DeveloperFactory createDeveloperBySpeciality(String specialty){
        if(specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if(specialty.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }else{
            throw new RuntimeException(specialty + "unknown specialty");
        }
    }
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("c++");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }
}
