public class projetoAlura {

    public static void main(String[] args) {
        System.out.println("Esse é o LanFlix");
        System.out.println("Filme: Bagman");

        int anoDelancamento = 2024;
        System.out.println("Ano de lançamento:"+ anoDelancamento);
        boolean incluindoNoPlano = true;
        double notaIMDB = 4.7;
        String sinopse;
        sinopse = """
                Filme Bagman
                terror
                Um pai enfrenta uma ameaça da infância que ressurge repentinamente. 
                Ele luta contra seu medo mais profundo, não por si mesmo, mas para proteger sua família do perigo sinistro.
                Muito bom!
                Ano de lançamento 
                """ + anoDelancamento;
                 System.out.println(sinopse);
    }
}