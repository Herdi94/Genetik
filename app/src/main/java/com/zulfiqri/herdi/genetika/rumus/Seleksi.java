package com.zulfiqri.herdi.genetika.rumus;

import static com.zulfiqri.herdi.genetika.rumus.Evaluasi.sumF1;
import static com.zulfiqri.herdi.genetika.rumus.Evaluasi.sumF2;
import static com.zulfiqri.herdi.genetika.rumus.Evaluasi.sumF3;
import static com.zulfiqri.herdi.genetika.rumus.Evaluasi.sumF4;
import static com.zulfiqri.herdi.genetika.rumus.Evaluasi.sumF5;
import static com.zulfiqri.herdi.genetika.rumus.Evaluasi.sumF6;

/**
 * Created by Herdi on 21/12/2016.
 */

public class Seleksi {


    public static Float bagiQ1(){
        float q1 = ((float)(1))/sumF1();
        return q1;
    }

    public static Float bagiQ2(){
        float q2 = ((float)(1))/sumF2();
        return q2;
    }

    public static Float bagiQ3(){
        float q3 = ((float)(1))/sumF3();
        return q3;
    }

    public static Float bagiQ4(){
        float q4 = ((float)(1))/sumF4();
        return q4;
    }

    public static Float bagiQ5(){
        float q5 = ((float)(1))/sumF5();
        return q5;
    }

    public static Float bagiQ6(){
        float q6 = ((float)(1))/sumF6();
        return q6;
    }

    public static Float sumQ() {
        float sumq1 = (bagiQ1()+bagiQ2()+bagiQ3()+bagiQ4()+bagiQ5()+bagiQ6());
        return sumq1;
    }


}
