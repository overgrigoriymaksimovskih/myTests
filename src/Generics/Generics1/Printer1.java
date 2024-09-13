package Generics.Generics1;

public class Printer1<T>{
    private String string = "";

    public String getString() {
        return string;
    }
    public void addToString (T t){
        if(this.string.equals("")){
            this.string = this.string + t.toString();
        }else{
            this.string = this.string + " - " + t.toString();
        }
    }
}
