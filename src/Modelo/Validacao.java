package Modelo;

import org.opencv.core.Point;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validacao {
    public String mensagem;


public Date ConverterStringToDate(String data) {
    Date dataConvertida = null;
    try {
        SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date dataUtil = formatoEntrada.parse(data);
        dataConvertida = new Date(dataUtil.getTime());
    } catch (ParseException e) {
        this.mensagem = e.getMessage();
    }
    return dataConvertida;
}
}
