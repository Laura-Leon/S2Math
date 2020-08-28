package com.example.s2math;

public class Pregunta {

    private String duda;
    private String respuesta;
    private int escoge;


    public Pregunta() {
        this. duda = duda;
        this.respuesta = respuesta;

    }

    void ejercicio (){
    this.escoge = (int)(Math.random()*19);

        switch (escoge) {
            case 0:
                duda = "2 * 8";
                respuesta = "16";

                break;
            case 1:
                duda = "5 * 4";
                respuesta = "20";


                break;
            case 2:
                duda = "10 * 7";
                respuesta = "70";


                break;
            case 3:
                duda = "3 * 9";
                respuesta = "27";


                break;
            case 4:
                duda = "7 * 6";
                respuesta = "42";


                break;
            case 5:
                duda = "6 * 9";
                respuesta = "54";


                break;
            case 6:
                duda = "4 * 2";
                respuesta = "8";


                break;
            case 7:
                duda = "3 * 5";
                respuesta = "15";


                break;
            case 8:
                duda = "4 * 8";
                respuesta = "32";


                break;
            case 9:
                duda = "5 + 10";
                respuesta = "15";


                break;
            case 10:
                duda = "13 + 10";
                respuesta = "23";


                break;
            case 11:
                duda = "33 + 27";
                respuesta = "60";


                break;
            case 12:
                duda = "50 - 24";
                respuesta = "26";


                break;
            case 13:
                duda = "77 - 46";
                respuesta = "31";


                break;
            case 14:
                duda =  "4 * 9";
                respuesta = "36";


                break;
            case 15:
                duda = "8 + 12";
                respuesta ="20";


                break;
            case 16:
                duda= "34 + 20";
                respuesta = "54";


                break;
            case 17:
                duda = "4 * 7";
                respuesta= "28";


                break;
            case 18:
                duda = "60 * 10";
                respuesta= "600";


                break;
            case 19:
                duda = "90 - 30";
                respuesta= "60";


                break;
            case 20:
                duda = "5 * 8";
                respuesta="40";


                break;

            default:

        }}


    public String getDuda() {
        return duda;
    }

    public void setDuda(String duda) {
        this.duda = duda;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getEscoge() {
        return escoge;
    }

    public void setEscoge(int escoge) {
        this.escoge = escoge;
    }
}
