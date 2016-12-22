package com.zulfiqri.herdi.genetika.rumus;

import static com.zulfiqri.herdi.genetika.rumus.Seleksi.bagiQ1;
import static com.zulfiqri.herdi.genetika.rumus.Seleksi.bagiQ2;
import static com.zulfiqri.herdi.genetika.rumus.Seleksi.bagiQ3;
import static com.zulfiqri.herdi.genetika.rumus.Seleksi.bagiQ4;
import static com.zulfiqri.herdi.genetika.rumus.Seleksi.bagiQ5;
import static com.zulfiqri.herdi.genetika.rumus.Seleksi.bagiQ6;
import static com.zulfiqri.herdi.genetika.rumus.Seleksi.sumQ;

/**
 * Created by Herdi on 21/12/2016.
 */

public class RouleteWheel {


    public static Float bagiP1(){
        float p1 = ((float)(bagiQ1()))/sumQ();
        return p1;
    }

    public static Float bagiP2(){
        float p2 = ((float)(bagiQ2()))/sumQ();
        return p2;
    }

    public static Float bagiP3(){
        float p3 = ((float)(bagiQ3()))/sumQ();
        return p3;
    }

    public static Float bagiP4(){
        float p4 = ((float)(bagiQ4()))/sumQ();
        return p4;
    }

    public static Float bagiP5(){
        float p5 = ((float)(bagiQ5()))/sumQ();
        return p5;
    }

    public static Float bagiP6(){

        float p6 = ((float)(bagiQ6()))/sumQ();
        return p6;
    }

}
