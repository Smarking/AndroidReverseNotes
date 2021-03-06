package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class df extends c {
    private final int height = 96;
    private final int width = 130;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 130;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                g = c.a(g, 1.0f, 0.0f, -238.0f, 0.0f, 1.0f, -408.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 238.0f, 0.0f, 1.0f, 408.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l = c.l(looper);
                l.moveTo(85.0f, 62.0f);
                l.lineTo(85.0f, 35.0f);
                l.cubicTo(85.0f, 33.81324f, 84.190865f, 33.0f, 83.0f, 33.0f);
                l.lineTo(49.0f, 33.0f);
                l.cubicTo(47.811264f, 33.0f, 47.0f, 33.81639f, 47.0f, 35.0f);
                l.lineTo(47.0f, 62.0f);
                l.cubicTo(47.0f, 63.18676f, 47.809135f, 64.0f, 49.0f, 64.0f);
                l.lineTo(83.0f, 64.0f);
                l.cubicTo(84.188736f, 64.0f, 85.0f, 63.18361f, 85.0f, 62.0f);
                l.close();
                l.moveTo(89.0f, 43.0f);
                l.cubicTo(93.40946f, 38.83027f, 99.615555f, 32.798397f, 100.0f, 32.0f);
                l.cubicTo(101.65531f, 31.724306f, 103.0f, 32.390232f, 103.0f, 34.0f);
                l.lineTo(103.0f, 63.0f);
                l.cubicTo(103.0f, 64.42094f, 101.78401f, 65.34744f, 100.0f, 65.0f);
                l.cubicTo(99.861565f, 64.30614f, 93.517f, 58.096f, 89.0f, 53.0f);
                l.lineTo(89.0f, 43.0f);
                l.lineTo(89.0f, 43.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
