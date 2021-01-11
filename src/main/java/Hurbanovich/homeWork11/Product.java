package homeWork11;

import java.util.Collection;
import java.util.TreeSet;

public class Product implements Comparable<Product>{
    private static int conterProduct;
    private String name;
    private int id;
    private int praice;
    private final int QUEUENUBER;

    public Product(String name, int id, int praice) {
        this.name = name;

        this.id = id;
        this.praice = praice;
        this.QUEUENUBER =conterProduct;
        conterProduct++;
    }

    public int getQUEUENUBER() {
        return QUEUENUBER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPraice() {
        return praice;
    }

    public void setPraice(int praice) {
        this.praice = praice;
    }

    @Override
    public String toString() {
        return '\n' + "Name: " + name +
                ", Id: " + id +
                ", Praice: " + praice + '\n';
    }

        @Override
        public int compareTo(Product o) {
            int tmp = this.QUEUENUBER - o.getQUEUENUBER();
            if (tmp ==0) {
                tmp =  this.getPraice() - o.getPraice();
                if(tmp ==0 ){
                    return this.name.compareTo(o.getName());
                } else {
                    return tmp;
                }
            }
            return tmp;

        }

}
//    public void SortingFromlastToFirst(TreeSet<Produts> original){
//        TreeSet<Produts> coppy;
//        coppy = new TreeSet<Produts>((Collection<? extends Produts>) original.clone());
//        for (int i = 0; i < original.size(); i++) {
//            Produts str = coppy.last();
//            System.out.println(str);
//            coppy.remove(coppy.last());