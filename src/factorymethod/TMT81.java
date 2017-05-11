package factorymethod;

public class TMT81 implements ImpressoraFiscal{

    @Override
    public void emitirNotaFiscal() {
        System.out.println("LOG: Emitindo nota fiscal através da impressora Epson TMT81");
    }

    @Override
    public void leituraX() {
        System.out.println("LOG: Realizando leitura X na impressora Epson TMT81");
    }

    @Override
    public void reducaoZ() {
        System.out.println("LOG: Realizando redução Z na impressora Epson TMT81");
    }
    
}
