package projetocelular;

public class CellBateria {

    //Atributos
    private int nivel;


    public CellBateria(int nivel) {
        this.setNivel(nivel);
    }



    public int getNivel() {
        return nivel;
    }

    //Dados
    public void dados() {
        System.out.println("Seu nivel de bateria: " + getNivel() + "\n");
    }

    public void setNivel(int nivel) {
        nivel += getNivel();
        
        if (nivel <= 100) {
            this.nivel = nivel;
//            System.out.println("TOTALLLL: "+ nivel);
        } else {
            System.out.println("Desculpe mias este numero esta invalido!");
        }

    }

}
