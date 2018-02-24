/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave;

/**
 *
 * @author benja
 */
public class Clave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String me = "hola mundo";
        char[] crip = me.toCharArray();
        String[] mensaje = new String[crip.length];
        for (int i = 0; i < crip.length; i++) {
            mensaje[i] = crip[i] + "";
        }

        
        String secreto = encriptar(mensaje);
        System.out.println(secreto);

        String[] men = secreto.split("\\|");
        String d = desencriptar(men);
        System.out.println(d);
    }

    private static String encriptar(String[] mensaje) {
        String abcd[] = {" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n","ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "¿", "?", "-"};
        String code[] = {"x", "8", "7", "6", "5", "4", "3", "2", "1", "0", "9", "12", "13", "14", "15", "16", "27", "28", "29", "40", "41", "42", "43", "44", "45", "46", "51", "52", "64", "76","97"};

        String encry = "";

        for (int i = 0; i < mensaje.length; i++) {
            for (int j = 0; j < abcd.length; j++) {
                if (mensaje[i].equals(abcd[j])) {
                    encry = encry + code[j] + "|";
                }
            }
        }
        return encry;
    }

    private static String desencriptar(String[] codigo) {
        String abcd[] = {" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n","ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "¿", "?", "-", ""};
        String code[] = {"x", "8", "7", "6", "5", "4", "3", "2", "1", "0", "9", "12", "13", "14", "15", "16", "27", "28", "29", "40", "41", "42", "43", "44", "45", "46", "51", "52", "64", "76","97" ,"|"};

        String encry = "";

        for (int i = 0; i < codigo.length; i++) {
            for (int j = 0; j < code.length; j++) {
                if (codigo[i].equals(code[j])) {
                    encry = encry + abcd[j];
                }

            }
        }
        return encry;
    }

}
