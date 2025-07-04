/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialfinal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author jcrom
 */
public class ParcialFinal {
    LocalDate date;
    LocalDateTime ldt = LocalDateTime.now();
    private int day = ldt.getDayOfMonth();
    private int month = Integer.parseInt(String.valueOf(ldt.getMonth()));
    private int year = ldt.getYear();
    int hora = ldt.getHour();
    int minute = ldt.getMinute();
    int seconds = ldt.getSecond();
    
    final String fecha = day + "/" + month + "/" + year;
    final String time = hora + ":" + minute + ":" + seconds;
   
    
}
