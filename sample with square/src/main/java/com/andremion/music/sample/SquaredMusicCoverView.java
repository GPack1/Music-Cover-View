package com.andremion.music.sample;

import android.content.Context;
import android.util.AttributeSet;

import com.andremion.music.MusicCoverView;

public class SquaredMusicCoverView extends MusicCoverView {

	public SquaredMusicCoverView(final Context context) {
		super(context);
	}

	public SquaredMusicCoverView(final Context context, final AttributeSet attrs) {
		super(context, attrs);
	}

	public SquaredMusicCoverView(final Context context, final AttributeSet attrs,
								 final int defStyle) {
		super(context, attrs, defStyle);
	}

	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);

		int width = getMeasuredWidth();
		setMeasuredDimension(width, width);
	}

}
