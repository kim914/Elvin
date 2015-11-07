package com.example.elvin.movingball;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by elvin on 15/11/7.
 */
public class DrawView extends View {

    public float currentX = 40;
    public float currentY = 50;

    //定义并创建画笔
    Paint p = new Paint();

    public DrawView(Context context) {
        super(context);
    }

    public DrawView(Context context, AttributeSet set) {
        super(context, set);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 设置画笔的颜色
        p.setColor(Color.RED);
        // 绘制一个小圆（作为小球）
        canvas.drawCircle(currentX, currentY, 15, p);
    }

    // 为该组建的触碰事件重写事件处理方法

    public boolean onTouchEvent(MotionEvent event){
        // 修改 currentX, currentY 两个属性
        currentX = event.getX();
        currentY = event.getY();
        //通知当前组建重绘自己
        invalidate();
        // 返回 true 表明该处理方法已经处理改事件
        return true;
    }



}
