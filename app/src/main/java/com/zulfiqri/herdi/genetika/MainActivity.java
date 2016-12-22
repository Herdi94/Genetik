package com.zulfiqri.herdi.genetika;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

import static com.zulfiqri.herdi.genetika.rumus.Evaluasi.sumF1;
import static com.zulfiqri.herdi.genetika.rumus.Evaluasi.sumF2;
import static com.zulfiqri.herdi.genetika.rumus.Evaluasi.sumF3;
import static com.zulfiqri.herdi.genetika.rumus.Evaluasi.sumF4;
import static com.zulfiqri.herdi.genetika.rumus.Evaluasi.sumF5;
import static com.zulfiqri.herdi.genetika.rumus.Evaluasi.sumF6;
import static com.zulfiqri.herdi.genetika.rumus.RouleteWheel.bagiP1;
import static com.zulfiqri.herdi.genetika.rumus.RouleteWheel.bagiP2;
import static com.zulfiqri.herdi.genetika.rumus.RouleteWheel.bagiP3;
import static com.zulfiqri.herdi.genetika.rumus.RouleteWheel.bagiP4;
import static com.zulfiqri.herdi.genetika.rumus.RouleteWheel.bagiP5;
import static com.zulfiqri.herdi.genetika.rumus.RouleteWheel.bagiP6;
import static com.zulfiqri.herdi.genetika.rumus.Seleksi.bagiQ1;
import static com.zulfiqri.herdi.genetika.rumus.Seleksi.bagiQ2;
import static com.zulfiqri.herdi.genetika.rumus.Seleksi.bagiQ3;
import static com.zulfiqri.herdi.genetika.rumus.Seleksi.bagiQ4;
import static com.zulfiqri.herdi.genetika.rumus.Seleksi.bagiQ5;
import static com.zulfiqri.herdi.genetika.rumus.Seleksi.bagiQ6;
import static com.zulfiqri.herdi.genetika.rumus.Seleksi.sumQ;

public class MainActivity extends AppCompatActivity {

    private TextView txtPembentukan;
    private Button btnPembentukan;
    private TextView txtInisialisasi;
    private Button btnInisialisasi;
    private TextView txtEvaluasi;
    private Button btnEvaluasi;
    private TextView txtSeleksi;
    private Button btnSeleksi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pembentukan chromosome
        txtPembentukan = (TextView) findViewById(R.id.txtPembentukan);
        btnPembentukan = (Button) findViewById(R.id.btnPembentukan);
        btnPembentukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pembentukan();
            }
        });

        //inisialisasi
        txtInisialisasi = (TextView) findViewById(R.id.txtInisialisasi);
        btnInisialisasi = (Button) findViewById(R.id.btnInisialisasi);
        btnInisialisasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inisialisasi();
            }
        });

        //evaluasi chromosome
        txtEvaluasi = (TextView) findViewById(R.id.txtEvaluasi);
        btnEvaluasi = (Button) findViewById(R.id.btnEvaluasi);
        btnEvaluasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                evaluasi();
            }
        });

        //seleksi
        txtSeleksi = (TextView) findViewById(R.id.txSeleksi);
        btnSeleksi = (Button) findViewById(R.id.btnSeleksi);
        btnSeleksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleksi();
            }
        });
    }


    private void pembentukan() {
        //pembentukan chromosome
        String[] ben = {"A", "B", "C", "D", "E", "F"};

        txtPembentukan.setVisibility(txtPembentukan.getVisibility() == View.VISIBLE
                ? View.GONE : View.VISIBLE);
        String bentuk = Arrays.toString(ben).replaceAll(",", "|");
        txtPembentukan.setText(bentuk);
    }

    private void inisialisasi() {
        //inisiasi chromosome
        String[] ini = {"A", "B", "C", "D", "E", "F"};
        String[] ini2 = {"A", "C", "D", "E", "F", "B"};
        String[] ini3 = {"A", "D", "E", "F", "B", "C"};
        String[] ini4 = {"A", "E", "F", "B", "C", "D"};
        String[] ini5 = {"A", "F", "B", "C", "D", "E"};
        String[] ini6 = {"A", "F", "C", "B", "D", "E"};

        txtInisialisasi.setVisibility(txtInisialisasi.getVisibility() == View.VISIBLE
                ? View.GONE : View.VISIBLE);
        String chromosome = "C1= " + Arrays.toString(ini).replaceAll(",", " ") + "\n"
                + "C2= " + Arrays.toString(ini2).replaceAll(",", " ") + "\n"
                + "C3= " + Arrays.toString(ini3).replaceAll(",", " ") + "\n"
                + "C4= " + Arrays.toString(ini4).replaceAll(",", " ") + "\n"
                + "C5= " + Arrays.toString(ini5).replaceAll(",", " ") + "\n"
                + "C6= " + Arrays.toString(ini6).replaceAll(",", " ");

        txtInisialisasi.setText(chromosome);
    }

    private void evaluasi() {
        //inisialisasi evaluasi chromosome
        String[] eva1 = {"AB", "BC", "CD", "DE", "EF", "FA"};
        String[] eva2 = {"AC", "CD", "DE", "EF", "FB", "BA"};
        String[] eva3 = {"AD", "DE", "EF", "FB", "BC", "CA"};
        String[] eva4 = {"AE", "EF", "FB", "BC", "CD", "DA"};
        String[] eva5 = {"AF", "FB", "BC", "CD", "DE", "EA"};
        String[] eva6 = {"AF", "FC", "CB", "BD", "DE", "EA"};

        int[] f1 = {5, 4, 9, 8, 5, 3};
        int[] f2 = {7, 9, 8, 5, 7, 5};
        int[] f3 = {8, 8, 5, 7, 4, 7};
        int[] f4 = {6, 5, 7, 4, 9, 8};
        int[] f5 = {3, 7, 4, 9, 8, 6};
        int[] f6 = {3, 7, 4, 6, 8, 6};


        txtEvaluasi.setVisibility(txtEvaluasi.getVisibility() == View.VISIBLE
                ? View.GONE : View.VISIBLE);
        String fitness = "F1= " + Arrays.toString(eva1).replaceAll(",", " +") + "\n"
                + "F1= " + Arrays.toString(f1).replaceAll("\\[+|\\]", " ").replaceAll(",", " +") + "= " + sumF1() + "\n\n"
                + "F2= " + Arrays.toString(eva2).replaceAll(",", " +") + "\n"
                + "F2= " + Arrays.toString(f2).replaceAll("\\[+|\\]", " ").replaceAll(",", " +") + "= " + sumF2() + "\n\n"
                + "F3= " + Arrays.toString(eva3).replaceAll(",", " +") + "\n"
                + "F3= " + Arrays.toString(f3).replaceAll("\\[+|\\]", " ").replaceAll(",", " +") + "= " + sumF3() + "\n\n"
                + "F4= " + Arrays.toString(eva4).replaceAll(",", " +") + "\n"
                + "F4= " + Arrays.toString(f4).replaceAll("\\[+|\\]", " ").replaceAll(",", " +") + "= " + sumF4() + "\n\n"
                + "F5= " + Arrays.toString(eva5).replaceAll(",", " +") + "\n"
                + "F5= " + Arrays.toString(f5).replaceAll("\\[+|\\]", " ").replaceAll(",", " +") + "= " + sumF5() + "\n\n"
                + "F6= " + Arrays.toString(eva6).replaceAll(",", " +") + "\n"
                + "F6= " + Arrays.toString(f6).replaceAll("\\[+|\\]", " ").replaceAll(",", " +") + "= " + sumF6();
        txtEvaluasi.setText(fitness);
    }

    private void seleksi() {

        txtSeleksi.setVisibility(txtSeleksi.getVisibility() == View.VISIBLE
                ? View.GONE : View.VISIBLE);

        int i = 1;

        String probabilitas = "Q1= " + String.valueOf(i) + "/" + String.valueOf(sumF1()) + " = " + String.format("%.3f", bagiQ1()) + "\n"
                + "Q2= " + String.valueOf(i) + "/" + String.valueOf(sumF2()) + " = " + String.format("%.3f", bagiQ2()) + "\n"
                + "Q3= " + String.valueOf(i) + "/" + String.valueOf(sumF3()) + " = " + String.format("%.3f", bagiQ3()) + "\n"
                + "Q4= " + String.valueOf(i) + "/" + String.valueOf(sumF4()) + " = " + String.format("%.3f", bagiQ4()) + "\n"
                + "Q5= " + String.valueOf(i) + "/" + String.valueOf(sumF5()) + " = " + String.format("%.3f", bagiQ5()) + "\n"
                + "Q6= " + String.valueOf(i) + "/" + String.valueOf(sumF6()) + " = " + String.format("%.3f",bagiQ6()) + "\n\n";

        String rouleteWheel = "P1= " + String.format("%.3f",bagiQ1()) + "/" + String.format("%.3f",sumQ()) + " = " + String.format("%.3f",bagiP1()) + "\n"
                + "P2= " + String.format("%.3f",bagiQ2()) + "/" + String.format("%.3f",sumQ()) + " = " + String.format("%.3f", bagiP2()) + "\n"
                + "P3= " + String.format("%.3f",bagiQ3()) + "/" + String.format("%.3f",sumQ()) + " = " + String.format("%.3f", bagiP3()) + "\n"
                + "P4= " + String.format("%.3f",bagiQ4()) + "/" + String.format("%.3f",sumQ()) + " = " + String.format("%.3f", bagiP4()) + "\n"
                + "P5= " + String.format("%.3f",bagiQ5()) + "/" + String.format("%.3f",sumQ()) + " = " + String.format("%.3f", bagiP5()) + "\n"
                + "P6= " + String.format("%.3f",bagiQ6()) + "/" + String.format("%.3f",sumQ()) + " = " + String.format("%.3f", bagiP6()) + "\n\n";

        txtSeleksi.setText(probabilitas+rouleteWheel);
    }


}
