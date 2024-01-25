package agro.curso.javabasico.heranca_interface_polimorfismo.heranca_polimorfismo;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Pessoa professor = new Professor();

        aluno.setEndereco("teste");
        aluno.setCurso("Psicologia");
        double[] notas = { 10 };
        aluno.setNotas(notas);
        professor.setEndereco("teste 2");

        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
        System.out.println(aluno);

        Aluno aluno2 = new Aluno();

        aluno2.setEndereco("teste");
        aluno2.setCurso("Psicologia");
        double[] notas2 = { 10 };
        aluno2.setNotas(notas2);

        System.out.println(aluno2);
        System.out.println(aluno.equals(aluno2));

        /*
         * CASTING
         * 
         * Converte uma subclasse para o tipo superclasse ou vice-versa
         * (Upcasting ou Downcasting)
         * 
         * 
         */
        Aluno aluno3 = new Aluno();
        Pessoa pessoaAluno = aluno3; // upcasting
        // Pessoa downcasting = new Pessoa(); //esse tipo de downcasting não é
        // valido
        // Aluno down = (Aluno) downcasting;

        Object obj1 = obterString();
        String s1 = (String) obj1;

        Object obj2 = "Minha String";
        String s2 = (String) obj2;

        // Object obj3 = new Object(); ilegal
        // String s3 = (String) obj3;

        Pessoa instance = new Pessoa();
        Aluno instance1 = new Aluno();
        Professor Professor = new Professor();

        if (instance instanceof Pessoa) {
            System.out.println("É do tipo Pessoa");
        }
        if (instance1 instanceof Aluno) {
            System.out.println("É do tipo Aluno");
        }
        if (Professor instanceof Professor) {
            System.out.println("É do tipo Professor");
        }
    }

    public static String obterString() {
        return "Minha String";
    }
}
