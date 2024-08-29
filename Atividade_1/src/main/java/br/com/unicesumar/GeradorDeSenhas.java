package br.com.unicesumar;

import java.util.Random;

public class GeradorDeSenhas {

    String[] mai;
    String[] min;
    String[] num;
    String[] esp;

    public GeradorDeSenhas() {
        this.mai = new String[]{
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };

        this.min = new String[]{
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };

        this.num = new String[]{
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        };

        this.esp = new String[]{
                "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "\\", "-", "_", "=",
                "+", "[", "]", "{", "}", "|", ";", ":", "'", ",", ".", "<", ">", "?", "/"
        };
    }

    public String gerarSenha(int tam, boolean minusc, boolean maiusc, boolean numeros, boolean especial) {

        Random rand = new Random();
        String senha = "";
        String carac;

        while (senha.length() < tam){
            int n = rand.nextInt(33);
            carac = "";

            switch (n % 4) {
                case 0:
                    if (minusc) {
                        carac = gerarChar(n);
                    }
                    break;
                case 1:
                    if (maiusc) {
                        carac = gerarChar(n);
                    }
                    break;
                case 2:
                    if (numeros) {
                        carac = gerarChar(n);
                    }
                    break;
                case 3:
                    if (especial) {
                        carac = gerarChar(n);
                    }
                    break;
            }

            senha = senha + carac;
        }

        return senha;
    }

    private String gerarChar(int n){
        int v;
        return switch (n % 4) {
            case 0 -> {
                v = n % min.length;
                yield min[v];
            }
            case 1 -> {
                v = n % mai.length;
                yield mai[v];
            }
            case 2 -> {
                v = n % num.length;
                yield num[v];
            }
            case 3 -> {
                v = n % esp.length;
                yield esp[v];
            }
            default -> "";
        };
    }
}