package com.example.mycanvas;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawView(this));
    }
    class DrawView extends View {
        Paint p;
        Rect rect;

        public DrawView(Context context) {
            super(context);
            p = new Paint();
            rect = new Rect();
        }
        @Override
        protected void onDraw(Canvas canvas) {
            // настройка кисти
            // красный цвет
            p.setColor(Color.BLUE);
            // толщина линии = 10
            p.setStrokeWidth(10);

            // рисуем прямоугольник
            canvas.drawRect(90, 50, 400, 140, p);
            canvas.drawRect(90, 175, 400, 265, p);

            p.setColor(Color.RED);
            // рисуем круг с центром в (245,390), радиус = 80
            canvas.drawCircle(245, 395, 80, p);

            p.setColor(Color.GREEN);
            // Рисуем линии
            canvas.drawLine(100,550,400,550,p);
            canvas.drawLine(100,575,400,575,p);
            canvas.drawLine(100,600,400,600,p);
        }
    }
}