public class Aluno extends Pessoa{

    private double nota01;
    private double nota02;
    private double media;
    public void calcula_media(){
       media = (nota01+nota02)/2;
    }

    public double getNota01() {
        return nota01;
    }

    public double getNota02() {
        return nota02;
    }

    public void setNota02(double nota02) {
        this.nota02 = nota02;
    }

    public void setNota01(double nota01) {
        this.nota01 = nota01;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;

    }
}
