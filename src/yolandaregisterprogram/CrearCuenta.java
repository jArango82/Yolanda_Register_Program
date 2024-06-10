/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolandaregisterprogram;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import yolandaregisterprogram.GUI.Cuentas;
/**
 *
 * @author arang
 */
public class CrearCuenta {
    Cuentas cobro = new Cuentas();
    
    String Obra = (String) cobro.getObra().getSelectedItem();
    String nit;
    String Deudor = (String) cobro.getDeuda().getSelectedItem();
    String ahorros;
    String fecha;
    String concepto;
    String valor;
    
    Document CuentaCobro;
    FileOutputStream archivo;
    Paragraph Textodebe;
    Paragraph TextoConcepto;
    Paragraph linea;
    Paragraph nombre;
    
    
    public CrearCuenta (String fecha, String obra, String nit, String deudor, String ahorros, String concepto, String valor){
        this.fecha = fecha;
        this.Obra = obra;
        this.nit = nit;
        this.Deudor = deudor;
        this.ahorros = ahorros;
        this.concepto = concepto;
        this.valor = valor;
        
        CuentaCobro = new Document(PageSize.A4);
        Textodebe = new Paragraph("Debe a");
        TextoConcepto = new Paragraph("Por concepto de");
        linea = new Paragraph("____________________________");
        
    }

    public CrearCuenta() {
    }

    public Cuentas getCobro() {
        return cobro;
    }

    public void setCobro(Cuentas cobro) {
        this.cobro = cobro;
    }

    public String getObra() {
        return Obra;
    }

    public void setObra(String obra) {
        this.Obra = obra;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDeudor(String deudor) {
        return Deudor;
    }

    public void setDeudor(String deudor) {
        this.Deudor = deudor;
    }

    public String getAhorros(String ahorros) {
        return ahorros;
    }

    public void setAhorros(String ahorros) {
        this.ahorros = ahorros;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Document getCuentaCobro() {
        return CuentaCobro;
    }

    public void setCuentaCobro(Document CuentaCobro) {
        this.CuentaCobro = CuentaCobro;
    }

    public FileOutputStream getArchivo() {
        return archivo;
    }

    public void setArchivo(FileOutputStream archivo) {
        this.archivo = archivo;
    }

    public Paragraph getTextodebe() {
        return Textodebe;
    }

    public void setTextodebe(Paragraph Textodebe) {
        this.Textodebe = Textodebe;
    }

    public Paragraph getTextoConcepto() {
        return TextoConcepto;
    }

    public void setTextoConcepto(Paragraph TextoConcepto) {
        this.TextoConcepto = TextoConcepto;
    }
    
    public String obtenerNit(){
        switch (Obra){
            case "Santa Rita":
                return ": 901146955-4";
            case "Villa Maria":
                return ": 901566055-2";
            case "Bucares":
                return ": 234243243-7";
            case "Cantabria":
                return ": 234234234-3";
            default:
                return "No definido";
        }
    }
    
    public String obtenerCuenta(){
        switch(Deudor){
            case "Juan Manuel Arango":
                return "Cuenta de ahorros: 54144269881";
            case "Yolanda Bedoya":
                return "Cuenta de ahorros: 54125920392";
            default:
                return "No aplica";
        }
    }
    
    public String firmas(){
        switch(Deudor){
            case "Juan Manuel Arango":
                return "Juan Manuel Arango Bedoya \n"+
                        "CC: 1000.922.491 \n"+
                        "Cel: 311 2093948";
            case "Yolanda Bedoya":
                    return "Yolanda Bedoya Bedoya \n"+
                            "CC: 32.151.245 \n"+
                            "Cel: 322 7656019";
            default:
                return "No aplica";
        }
    }
    
    public void Crear(){
         try{
             archivo = new FileOutputStream("Cuenta de cobro "+Obra+".pdf");
              PdfWriter.getInstance(CuentaCobro, archivo);
              CuentaCobro.open();
              
              Font font = new Font(FontFamily.HELVETICA, 28, Font.BOLD);
              String NombreObra = Obra;
            Paragraph nombreObra = new Paragraph (NombreObra,font);
            Paragraph nit = new Paragraph ("NIT"+obtenerNit());
            Paragraph textoDebe = new Paragraph("Debe a: ");
            Paragraph nombreDeudor = new Paragraph (Deudor);
            Paragraph ahorros = new Paragraph (obtenerCuenta());
            Paragraph Pago = new Paragraph (valor);
            Paragraph porConcepto = new Paragraph (concepto);
            Paragraph firmar = new Paragraph (firmas());
            
              nombreObra.setAlignment(1);
              nit.setAlignment(1);
              textoDebe.setAlignment(1);
              nombreDeudor.setAlignment(1);
              ahorros.setAlignment(1);
              TextoConcepto.setAlignment(1);
               porConcepto.setAlignment(1);
               Pago.setAlignment(1);
               linea.setAlignment(1);
               firmar.setAlignment(1);
              Paragraph fechaT = new Paragraph("Fecha: "+fecha);
              fechaT.setAlignment(Element.ALIGN_CENTER);

            CuentaCobro.add(fechaT);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(nombreObra);
            CuentaCobro.add(nit);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(textoDebe);
            CuentaCobro.add(nombreDeudor);
            CuentaCobro.add(ahorros);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(TextoConcepto);
            CuentaCobro.add(porConcepto);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Pago);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(Chunk.NEWLINE);
            CuentaCobro.add(linea);
            CuentaCobro.add(firmar);
            
            
            CuentaCobro.close();
            System.out.println("El archivo se creo correctamente :D");
            
         }catch (DocumentException e){
            System.err.println(e.getMessage());
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(CrearCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
         CuentaCobro.close();
}
}
