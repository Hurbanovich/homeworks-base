package HomeWork05;

public class Task {
    public static void main(String[] args) {
        Computers comp = new Computers();
        while (true){
            comp.on();
            if (!comp.chekInclusionResource()){
                break;
            }
            comp.off();
            if (!comp.chekInclusionResource()){
                break;
            }
        }
        comp.on();
        comp.on();
        comp.on();
        comp.on();
        comp.on();
    }
}
