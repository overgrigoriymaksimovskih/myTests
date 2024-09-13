package InnerClases;

public class ClassZoo {
    public String name;
    public int area;
    private String cityLocation;

    public ClassZoo(String name, int area, String cityLocation) {
        this.name = name;
        this.area = area;
        this.cityLocation = cityLocation;
    }
    public class Lion {
        public void show (){
            System.out.println("Im lion");
        }
    }
    public class Tiger {
        protected void show (){
            System.out.println("Im tiger");
        }
    }
    public class Donkey{
        protected void show(){
            System.out.println("Im donkey");
        }
    }
    private class Monkey {
        private void show (){
            System.out.println("Im spy monkey");
        }
    }

    public static void main(String[] args) {
        ClassZoo myZoo = new ClassZoo("MyZoo", 200,"Im secret owner");
        Lion lion = myZoo.new Lion();
        Tiger tiger = myZoo.new Tiger();
        Monkey monkey = myZoo.new Monkey();
    }
}
