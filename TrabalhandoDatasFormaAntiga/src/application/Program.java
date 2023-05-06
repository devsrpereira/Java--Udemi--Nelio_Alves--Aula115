package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {

//Definir a formatacão da data
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2  = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat  sdf3  = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));


//Usando a formatação definida
        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 21:05:25");
        System.out.printf("%n*** Usando formatação definida no SimpleDateFormat ***%n");
        System.out.println("y1: "+sdf1.format(y1));
        System.out.println("y2: "+sdf2.format(y2));

//Criar uma data do agora
        Date y3 = new Date();
        Date y4 = new Date();
        System.out.printf("%n*** Criar data do agora com new Date() ***%n");
        System.out.println("y3: "+y3);
        System.out.println("y4: "+sdf2.format(y4));

//Gerar data com timeZone Global
        Date y5 = new Date();
        Date y6 = new Date();
        System.out.printf("%n*** Criar data do agora com new Date() ***%n");
        System.out.println("y5: "+sdf2.format(y5));
        System.out.println("y6: "+sdf3.format(y6));

//Somando uma unidade de Tempo
        Date y7 = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(y7);
        cal.add(Calendar.HOUR_OF_DAY,4);
        Date newY7 = cal.getTime();

        cal.setTime(y7);
        cal.add(Calendar.DAY_OF_MONTH,4);
        Date newY7ii = cal.getTime();


        System.out.printf("%n*** Somando unidades de tempo ***%n");
        System.out.println("y7 original: "+sdf2.format(y7));
        System.out.println("y7 original + 4 horas: "+sdf2.format(newY7));
        System.out.println("y7 original + 4 dias: "+sdf2.format(newY7ii));


//Subtraindo uma unidade de Tempo
        Date y8 = new Date();
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(y8);
        cal2.add(Calendar.HOUR,-4);
        Date newY8 = cal2.getTime();

        cal2.setTime(y8);
        cal2.add(Calendar.DAY_OF_MONTH,-4);
        Date newY8ii = cal2.getTime();


        System.out.printf("%n*** Subtraindo unidades de tempo ***%n");
        System.out.println("y8 original: "+sdf2.format(y8));
        System.out.println("y8 original - 4 horas: "+sdf2.format(newY8));
        System.out.println("y8 original - 4 dias: "+sdf2.format(newY8ii));


//Obtendo uma unidade de Tempo
        Date y9 = new Date();
        Calendar cal3 = Calendar.getInstance();
        cal3.setTime(y9);
        int horas = cal3.get(Calendar.HOUR_OF_DAY);
        int horas12 = cal3.get(Calendar.HOUR);
        int minutos = cal3.get(Calendar.MINUTE);
        int mes = 1+cal3.get(Calendar.MONTH);

        System.out.printf("%n*** Obtendo unidades de tempo ***%n");
        System.out.println("y9 original: "+sdf2.format(y8));
        System.out.println("y9 só as horas (0 a 23): "+horas);
        System.out.println("y9 só as horas (1 a 12): "+horas12);
        System.out.println("y9 só os minutos: "+minutos);
        System.out.println("y9 só o mês (sempre somar 1 no resultado): "+mes);

    }
}
