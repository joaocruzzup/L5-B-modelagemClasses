package ex01;

public class Jardinagem {
    String nomeJardim;
    double qtdMetros;
    int qtdPlantas;
    double qtdMetrosGrama;
    double gramaAdubo;
    double valorAdubo;
    double valorMetroGrama;
    double valorCorteGrama;

    public Jardinagem(String nomeJardim, double qtdMetros, int qtdPlantas, double qtdMetrosGrama, double valorAdubo, double valorMetroGrama) {
        this.nomeJardim = nomeJardim;
        this.qtdMetros = qtdMetros;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetrosGrama = qtdMetrosGrama;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
        this.gramaAdubo = 100.0;
    }

    public double usarAdubo() {
        return (qtdMetrosGrama / 2) * gramaAdubo / 10;
    }

    public double precoAdubo() {
        return usarAdubo() * valorAdubo;
    }

    public double precoCorteGrama() {
        valorCorteGrama = qtdMetrosGrama * valorMetroGrama;
        return valorCorteGrama;
    }

    public double calcularAreaDisponivel() {
        double areaDisp = qtdMetros - qtdMetrosGrama;
        return areaDisp;
    }

    public double calcularAreaPlanta() {
        double areaPlanta = calcularAreaDisponivel() / qtdPlantas;
        return areaPlanta;
    }

    public void imprimirInformacoes() {
        System.out.println("------- Informações do Jardim -------");
        System.out.printf(
                "Nome: %s %n" +
                        "Área Total disponível: %.2f m² %n" +
                        "Área para grama: %.2f m² %n" +
                        "Área para planta: %.2f m² %n" +
                        "Valor adubo: R$%.2f %n" +
                        "Valor da Grama/Metro: R$%.2f %n" +
                        "Gasto adubar: R$%.2f %n" +
                        "Gasto plantio grama: R$%.2f %n",
                nomeJardim, qtdMetros, qtdMetrosGrama, calcularAreaPlanta(), valorAdubo, valorMetroGrama,
                precoAdubo(), precoCorteGrama());
    }
}
