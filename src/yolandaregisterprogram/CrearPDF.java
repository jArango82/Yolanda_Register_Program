/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolandaregisterprogram;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author arang
 */
public class CrearPDF {
    String nombre;
    String apellido;
    String cedula;
    String pago;
    List<Trabajador> ListaPersonas;
    String fecha;
    String logo;
    
    Document constancia;
    FileOutputStream archivo;
    Paragraph nombreEmpresa;
    Paragraph NIT;
    Paragraph direccion;
    Paragraph telefono;
    Paragraph ubicacion;
    Paragraph correo;

    public CrearPDF(String nombre, String apellido, String cedula,String fecha, String pago,List<Trabajador>ListaPersonas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.pago = pago;
        this.ListaPersonas = ListaPersonas;
        this.fecha = fecha;
        this.logo = "resources/logo.png";
        
        constancia = new Document(PageSize.A4.rotate());
        nombreEmpresa = new Paragraph("Yolanda Bedoya Bedoya");
        NIT = new Paragraph("NIT: 32151245-1");
        direccion = new Paragraph("cr 50 #137 A sur 55");
        telefono = new Paragraph("3227656019");
        ubicacion = new Paragraph("Caldas - Antioquia");
        correo = new Paragraph("Yolandabb10@hotmail.com");
    }

    public CrearPDF(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return logo;
    }

    public void setImagen(String imagen) {
        this.logo = imagen;
    }

    public Document getConstancia() {
        return constancia;
    }

    public void setConstancia(Document constancia) {
        this.constancia = constancia;
    }

    public FileOutputStream getArchivo() {
        return archivo;
    }

    public void setArchivo(FileOutputStream archivo) {
        this.archivo = archivo;
    }
    
    
    
    
    
    public void creacion(){
        try{
            archivo = new FileOutputStream(nombre+".pdf");
            PdfWriter.getInstance(constancia, archivo);
            constancia.open();
            nombreEmpresa.setAlignment(1);
            NIT.setAlignment(1);
            direccion.setAlignment(1);
            telefono.setAlignment(1);
            ubicacion.setAlignment(1);
            correo.setAlignment(1);
            
            Image imagen = null;
            try{
                InputStream streamImage = getClass().getResourceAsStream(logo);
                imagen = Image.getInstance(IOUtils.toByteArray(streamImage));
                imagen.scaleAbsolute(200, 200);
                imagen.setAbsolutePosition(30, 408);
            }catch (Exception e){
                e.printStackTrace();
            }
            
             Paragraph fechaT = new Paragraph("Fecha: "+fecha);
            fechaT.setAlignment(Element.ALIGN_RIGHT);
            
            constancia.add(imagen);
            constancia.add(fechaT);
            constancia.add(nombreEmpresa);
            constancia.add(NIT);
            constancia.add(direccion);
            constancia.add(telefono);
            constancia.add(ubicacion);
            constancia.add(correo);
            constancia.add(Chunk.NEWLINE);
            constancia.add(Chunk.NEWLINE);
            constancia.add(Chunk.NEWLINE);
            constancia.add(Chunk.NEWLINE);
            constancia.add(Chunk.NEWLINE);
            
            Paragraph texto = new Paragraph("Por medio de la presente, certifico que la señora Yolanda Bedoya Bedoya ha realizado un pago a favor de "+nombre+" el día "+fechaT+". El monto abonado corresponde a la suma de: $"+pago+".\n" +
            "\n" + "Este comprobante de pago se emite con el propósito de constatar la transacción y servir como evidencia de la cancelación del mencionado importe.");
            constancia.add(texto);
            
             constancia.add(Chunk.NEWLINE);
            
            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);
            PdfPCell name = new PdfPCell(new Phrase("Nombre"));
            name.setBackgroundColor(BaseColor.WHITE);
            PdfPCell lastname = new PdfPCell(new Phrase("Apellido"));
            lastname.setBackgroundColor(BaseColor.WHITE);
            PdfPCell cc = new PdfPCell(new Phrase("Cedula"));
            cc.setBackgroundColor(BaseColor.WHITE);
            PdfPCell pay = new PdfPCell(new Phrase("Valor"));
            pay.setBackgroundColor(BaseColor.WHITE);
            
            tabla.addCell(name);
            tabla.addCell(lastname);
            tabla.addCell(cc);
            tabla.addCell(pay);            
            
            for(Trabajador persona: this.ListaPersonas){
                tabla.addCell(persona.getNombre());                
                tabla.addCell(persona.getApellido()+"");
                 tabla.addCell(persona.getCedula());
                tabla.addCell(persona.getPago());
            }
            constancia.add(tabla);          
            
            
            
            constancia.close();
            System.out.println("El archivo se creo satisfactoriamente");
    }catch(FileNotFoundException e){
            System.err.println(e.getMessage());
    }catch (DocumentException e){
            System.err.println(e.getMessage());
            constancia.close();
        }
    
}
}
