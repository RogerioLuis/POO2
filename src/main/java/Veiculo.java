

public class Veiculo {
    public String proprietario;
    public String marca;
    public String modelo ;
    public int ano ;
    public String cor;
    public Double quilometragem;
    public String renavam;


    public void imprimeDocumento() {
        System.out.println(
            this.proprietario + "" +
            this.marca + "" +   
            this.modelo + "" +
            this.ano + "" +
            this.cor + "" +
            this.quilometragem + "" +
            this.renavam + ""   
        

        );
    }
    

    
}
