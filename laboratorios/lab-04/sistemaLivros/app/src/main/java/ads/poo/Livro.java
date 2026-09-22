package ads.poo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;
import com.google.zxing.qrcode.QRCodeWriter;

public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String isbn, String titulo, String autor, int anoPublicacao) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    private StringBuilder qrCode(){

        StringBuilder sb = new StringBuilder();
        EAN13Writer writer = new EAN13Writer();
        QRCodeWriter qrCode = new QRCodeWriter();

        // Gera a matriz de bits para o formato EAN_13
        BitMatrix bitMatrix = null;
        try {
            bitMatrix = qrCode.encode(this.isbn, BarcodeFormat.QR_CODE, 30, 30);
        } catch (WriterException e) {
            throw new RuntimeException(e);
        }
        //BitMatrix bitMatrix = writer.encode(this.isbn, BarcodeFormat.EAN_13, largura, 1);
        // Renderiza o código de barras usando blocos cheios █ e espaços em branco
        // https://www.unicodepedia.com/unicode/block-elements/2588/full-block/
        for (int i = 0; i < bitMatrix.getHeight(); i++) {
            for (int x = 0; x < bitMatrix.getWidth(); x++) {
                if (bitMatrix.get(i, x)) {
                    sb.append("██");
                } else {
                    sb.append("  ");
                }
            }
            sb.append("\n"); // Quebra de linha para a próxima camada da barra
        }
        sb.append("\nISBN-13: ").append(this.isbn);

        return sb;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livro: ");
        sb.append("\nISBN: ").append(isbn);
        sb.append("\nTitulo: ").append(titulo);
        sb.append("\nAutor: ").append(autor);
        sb.append("\nAno de Publicação: ").append(anoPublicacao).append("\n\n");
        sb.append(this.qrCode());
        return sb.toString();
    }
}
