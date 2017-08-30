package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by phil on 8/30/17.
 */

public class ImageViewAspectRatio extends android.support.v7.widget.AppCompatImageView {
    public ImageViewAspectRatio(Context context) {
        super(context);
    }

    public ImageViewAspectRatio(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageViewAspectRatio(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int threeTwoHeight = MeasureSpec.getSize(widthMeasureSpec) * 2 / 3;
        int threeTwoHeightSpec = MeasureSpec.makeMeasureSpec(threeTwoHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, threeTwoHeightSpec);
    }
}
