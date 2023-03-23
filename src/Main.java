import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        Professor professor = new Professor();
        Aluno aluno = new Aluno();
        do {


            System.out.println("Escolha um número entre 0 (realizar cadastro professor) e 1 (Realizar cadastro aluno): ");
            int repetir;
            int numero = sc.nextInt();
            switch (numero) {

                case 0:
                    System.out.println("Cadastrar Professor");


                    //*cadastro do professor;

                    System.out.println("Informe o nome do professor: ");
                    professor.setNome(sc.next());
                    System.out.println("Informe a idade do professor: ");
                    professor.setIdade(sc.nextInt());
                    System.out.println("Informe a especializacao do professor: ");
                    professor.setEspecializacao(sc.next());
                    System.out.println("Informe o salario do professor: ");
                    professor.setSalario(sc.nextInt());
                    break;
                case 1:
                    System.out.println("Cadastrar Aluno");

                    //cadastro do aluno;

                    System.out.println("Informe o nome do aluno: ");
                    aluno.setNome(sc.next());
                    System.out.println("Informe a idade do aluno: ");
                    aluno.setIdade(sc.nextInt());
                    System.out.println("Informe a nota 01 do aluno: ");
                    aluno.setNota01(sc.nextInt());
                    System.out.println("Informe a nota 02 do aluno: ");
                    aluno.setNota02(sc.nextInt());
                    aluno.calcula_media();
                    System.out.println(aluno.getMedia());

                    break;
            }
            System.out.println("Deseja continuar, digite 2: ");
            x = sc.nextInt();
        } while( x == 2);
    }
}