package factorymethod;

public class MP4000 implements ImpressoraFiscal{

    @Override
    public void emitirNotaFiscal() {
        System.out.println("LOG: Emitindo nota fiscal através da impressora Bematech MP4000");
    }

    @Override
    public void leituraX() {
        System.out.println("LOG: Realizando leitura X na impressora Bematech MP4000");
    }

    @Override
    public void reducaoZ() {
        System.out.println("LOG: Realizando redução Z na impressora Bematech MP4000");
    }
    
}
