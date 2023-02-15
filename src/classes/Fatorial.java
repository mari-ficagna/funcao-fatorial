/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Mari (48) 99618-5728
 */
public class Fatorial {
    private int num = 0; //num é um atributo
    private int fat = 1; //fat (fatorial) também é um atributo)
    private String formula = ""; // formula também é um atributo do tipo String, e vai começar vazio
    
    public void setValor (int n) { //o n não tem retorno pois é void e setValor é um método (tipo main)
        num = n;
        int f = 1;
        String s = "";
        for (int c = n; c > 1; c--) {
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    public int getFatorial () { //pega o fatorial
        return fat;
    }
    public String getFormula() { //pega a formula
        return formula;
    }
}
