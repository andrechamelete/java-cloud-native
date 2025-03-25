public class ForLoop { 

    public static void main(String[] args) throws Exception { 

        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.printf("contando aluno %s%n", alunos[x]);
        }

        for (String aluno : alunos) {
            System.out.printf("aluno %s%n", aluno);
        }
    }
}