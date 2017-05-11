package factorymethod;

public class FS700 implements ImpressoraFiscal{

    @Override
    public void emitirNotaFiscal() {
        System.out.println("LOG: Emitindo nota fiscal através da impressora Daruma FS700");
    }

    @Override
    public void leituraX() {
        System.out.println("LOG: Realizando leitura X na impressora Daruma FS700");
    }

    @Override
    public void reducaoZ() {
        System.out.println("LOG: Realizando redução Z na impressora Daruma FS700");
    }
    
}
