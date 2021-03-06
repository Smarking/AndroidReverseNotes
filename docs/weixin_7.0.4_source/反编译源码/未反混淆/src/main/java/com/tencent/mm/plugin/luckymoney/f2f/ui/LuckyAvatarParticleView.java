package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class LuckyAvatarParticleView extends View {
    public static DisplayMetrics ghw;
    private Paint aFY = new Paint();
    private long duration;
    private ValueAnimator jcQ;
    private int nUA;
    private int nUB;
    private int nUC;
    private int nUu;
    private int nUv;
    private List<Rect> nUw = new ArrayList();
    private List<Integer> nUx = new ArrayList();
    private List<Integer> nUy = new ArrayList();
    private int nUz;

    public LuckyAvatarParticleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AppMethodBeat.i(42161);
        AppMethodBeat.o(42161);
    }

    private int getRandomVelocity() {
        AppMethodBeat.i(42162);
        int random = this.nUz + ((int) (Math.random() * ((double) (this.nUA - this.nUz))));
        AppMethodBeat.o(42162);
        return random;
    }

    private int getRandomRectWidth() {
        AppMethodBeat.i(42163);
        int random = this.nUB + ((int) (Math.random() * ((double) (this.nUC - this.nUB))));
        AppMethodBeat.o(42163);
        return random;
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        AppMethodBeat.i(42164);
        super.onDraw(canvas);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.nUw.size()) {
                canvas.drawRect((Rect) this.nUw.get(i2), this.aFY);
                i = i2 + 1;
            } else {
                AppMethodBeat.o(42164);
                return;
            }
        }
    }

    public void setDuration(long j) {
        AppMethodBeat.i(42165);
        this.duration = j;
        this.jcQ = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(this.duration);
        this.jcQ.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppMethodBeat.i(42160);
                if (((Float) valueAnimator.getAnimatedValue()).floatValue() == 1.0f) {
                    LuckyAvatarParticleView.this.nUw.clear();
                    LuckyAvatarParticleView.this.nUx.clear();
                    LuckyAvatarParticleView.this.nUy.clear();
                } else if (((Float) valueAnimator.getAnimatedValue()).floatValue() == 0.0f) {
                    LuckyAvatarParticleView.d(LuckyAvatarParticleView.this);
                } else {
                    for (int i = 0; i < LuckyAvatarParticleView.this.nUw.size(); i++) {
                        LuckyAvatarParticleView.a(LuckyAvatarParticleView.this, i);
                    }
                }
                LuckyAvatarParticleView.this.invalidate();
                AppMethodBeat.o(42160);
            }
        });
        AppMethodBeat.o(42165);
    }

    public void setColor(int i) {
        AppMethodBeat.i(42166);
        this.aFY.setColor(i);
        this.aFY.setStyle(Style.FILL);
        AppMethodBeat.o(42166);
    }

    static /* synthetic */ void d(LuckyAvatarParticleView luckyAvatarParticleView) {
        int i;
        int random;
        int i2 = 20;
        AppMethodBeat.i(42167);
        for (i = 0; i < 20; i++) {
            random = (int) (Math.random() * ((double) luckyAvatarParticleView.getHeight()));
            int randomRectWidth = luckyAvatarParticleView.getRandomRectWidth();
            luckyAvatarParticleView.nUw.add(new Rect(0, random, randomRectWidth, random + randomRectWidth));
            randomRectWidth = luckyAvatarParticleView.getRandomVelocity();
            luckyAvatarParticleView.nUx.add(Integer.valueOf(randomRectWidth));
            random = (int) (((double) ((((float) Math.abs(random - luckyAvatarParticleView.nUv)) * (((float) randomRectWidth) * 1.0f)) / ((float) Math.abs(luckyAvatarParticleView.nUu)))) + 0.5d);
            if (random == 0) {
                random = 1;
            }
            luckyAvatarParticleView.nUy.add(Integer.valueOf(random));
        }
        while (i2 < 40) {
            random = (int) (Math.random() * ((double) luckyAvatarParticleView.getHeight()));
            i = luckyAvatarParticleView.getRandomRectWidth();
            luckyAvatarParticleView.nUw.add(new Rect(ghw.widthPixels, random, ghw.widthPixels + i, i + random));
            i = luckyAvatarParticleView.getRandomVelocity();
            luckyAvatarParticleView.nUx.add(Integer.valueOf(i));
            random = (int) (((double) ((((float) Math.abs(random - luckyAvatarParticleView.nUv)) * (((float) i) * 1.0f)) / ((float) Math.abs(ghw.widthPixels - luckyAvatarParticleView.nUu)))) + 0.5d);
            if (random == 0) {
                random = 1;
            }
            luckyAvatarParticleView.nUy.add(Integer.valueOf(random));
            i2++;
        }
        AppMethodBeat.o(42167);
    }

    static /* synthetic */ void a(LuckyAvatarParticleView luckyAvatarParticleView, int i) {
        AppMethodBeat.i(42168);
        Rect rect = (Rect) luckyAvatarParticleView.nUw.get(i);
        int width = rect.width();
        if (Math.abs(luckyAvatarParticleView.nUu - rect.left) <= ((Integer) luckyAvatarParticleView.nUx.get(i)).intValue()) {
            rect.left = luckyAvatarParticleView.nUu;
        } else if (luckyAvatarParticleView.nUu > rect.left) {
            rect.left = ((Integer) luckyAvatarParticleView.nUx.get(i)).intValue() + rect.left;
        } else if (luckyAvatarParticleView.nUu < rect.left) {
            rect.left -= ((Integer) luckyAvatarParticleView.nUx.get(i)).intValue();
        }
        rect.right = rect.left + width;
        if (Math.abs(luckyAvatarParticleView.nUv - rect.top) <= ((Integer) luckyAvatarParticleView.nUy.get(i)).intValue()) {
            rect.top = luckyAvatarParticleView.nUv;
        } else if (luckyAvatarParticleView.nUv > rect.top) {
            rect.top = ((Integer) luckyAvatarParticleView.nUy.get(i)).intValue() + rect.top;
        } else if (luckyAvatarParticleView.nUv < rect.top) {
            rect.top -= ((Integer) luckyAvatarParticleView.nUy.get(i)).intValue();
        }
        rect.bottom = rect.top + width;
        AppMethodBeat.o(42168);
    }
}
