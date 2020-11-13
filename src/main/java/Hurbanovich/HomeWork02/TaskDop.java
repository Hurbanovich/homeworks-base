package Hurbanovich.HomeWork02;

import javax.swing.*;

public class TaskDop {
    private static Object Continue;

    public static void main(String[] args) {
        String str;
        str = JOptionPane.showInputDialog(null,"Введите 1 для вычисления ряда чисел фибоначчи или 2 для вычисления факториала");
            double zadahca = Double.parseDouble(str);
            if (zadahca==1){
                str = JOptionPane.showInputDialog(null, "выберите тип цикла 1-while, 2- do-while, 3-for ");
                double ckl = Double.parseDouble(str);

                if (ckl==3) { str = JOptionPane.showInputDialog(null,"Pаботаем с for. Сколько вывести чисел?");
                    double vvod = Double.parseDouble(str);
                    int a1 = 1;
                    int a2 = 1;
                    int c = 0;
                    System.out.println(0);
                    for (int i = 1; i < vvod; i++) {
                        System.out.println(a1);
                        a1 = a1 + a2;
                        c = a1;
                        a1 = a2;
                        a2 = c;
                    }
                } else if (ckl==1) {
                    str = JOptionPane.showInputDialog(null,"Pаботаем с while. Сколько вывести чисел?");
                    double vvod = Double.parseDouble(str);
                    System.out.println(0);
                    int a1 = 1;
                    int a2 = 1;
                    int c = 0;
                    int i = 1;
                    while (i < vvod) {
                        System.out.println(a1);
                        a1 = a1 + a2;
                        c = a1;
                        a1 = a2;
                        a2 = c;
                        i++;
                    }
                } else if (ckl==2) {
                    str = JOptionPane.showInputDialog(null,"Pаботаем с do-while. Сколько вывести чисел?");
                    double vvod = Double.parseDouble(str);
                    int a1 = 0;
                    int a2 = 1;
                    int c = 0;
                    int i = 1;
                    do {
                        System.out.println(a1);
                        a1 = a1 + a2;
                        c = a1;
                        a1 = a2;
                        a2 = c;
                        --vvod;
                    } while (vvod >= 1);
                }else {
                    JOptionPane.showMessageDialog(null, "невеное значение");
                }
            } else if (zadahca==2) {
                str = JOptionPane.showInputDialog(null, "выберите тип цикла 1-while, 2- do-while, 3-for ", JOptionPane.QUESTION_MESSAGE);
                double ckl = Double.parseDouble(str);
                if (ckl==3) {
                    str = JOptionPane.showInputDialog(null,"Pаботаем с for. Факториал какого числа вывести?");
                    double vod = Double.parseDouble(str);
                    int a = 1;
                    int b = 2;
                    for (int i = 1; i < vod; i++) {
                        a = a * b;
                        b++;
                    }
                    System.out.println(a);
                } else if (ckl==1) {
                    str = JOptionPane.showInputDialog(null,"Pаботаем с while. Факториал какого числа вывести?");
                    double vod = Double.parseDouble(str);
                    int a = 1;
                    int b = 2;
                    int i = 1;
                    while (i < vod) {
                        a = a * b;
                        b++;
                        i++;
                    }
                    System.out.println(a);
                } else if (ckl==2) {
                    str = JOptionPane.showInputDialog(null,"Pаботаем с do-waile. Факториал какого числа вывести?");
                    double vod = Double.parseDouble(str);
                    int a = 1;
                    int b = 2;
                    int i = 1;
                    do {
                        //System.out.println(a);
                        a = a * b;
                        b++;
                        i++; } while (i < vod);
                    System.out.println(a);
                }else{
                    JOptionPane.showMessageDialog(null, "невеное значение");

                }
            }else {
                JOptionPane.showMessageDialog(null, "невеное значение");
            }

    }
}





