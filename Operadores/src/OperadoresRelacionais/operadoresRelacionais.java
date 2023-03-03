package OperadoresRelacionais;

public class operadoresRelacionais {

    public static void main(String[] arg) {
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;


        System.out.print((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.print((salarioBaixo) || (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) || (muitosDependentes);

        System.out.print("Recebe Auxilio : " + recebeAuxilio );


    }
}
