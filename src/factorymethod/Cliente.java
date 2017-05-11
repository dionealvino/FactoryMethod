package factorymethod;

public class Cliente {

    public static void main(String[] args) {
        
        System.out.println("------- Localizando Impressora Bematech -------");
        FabricaImpressora fabrica = new ImpressorasBematech();
        ImpressoraFiscal impressora = fabrica.adicionaImpressora();
        impressora.leituraX();
        impressora.emitirNotaFiscal();
        impressora.reducaoZ();
        
        System.out.println("------- Localizando Impressora Daruma -------");
        fabrica = new ImpressorasDaruma();
        impressora = fabrica.adicionaImpressora();
        impressora.leituraX();
        impressora.emitirNotaFiscal();
        impressora.reducaoZ();
        
        System.out.println("------- Localizando Impressora Epson -------");
        fabrica = new ImpressorasEpson();
        impressora = fabrica.adicionaImpressora();
        impressora.leituraX();
        impressora.emitirNotaFiscal();
        impressora.reducaoZ();
    } 
}
