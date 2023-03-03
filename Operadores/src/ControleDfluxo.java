public class ControleDfluxo {
    public static void main(String[] args) {
        ifSemFlecha();
    }

    private static void ifSemFlecha() {

        System.out.println("Qual é o mês do ano ?? ");
        int mes  = 1;

        if (mes == 1) {
            System.out.println(" Janeiro ");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println(" Ferias ");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("setembro");
        } else if (mes == 10) {
            System.out.println("outubro");
        } else if (mes == 11) {
            System.out.println("novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        }

        if((mes == 1) || (mes == 7) || (mes == 12)) {
            System.out.println("VOCÊ ESTÀ DE FERIAS!!!");
        }

    }


}
