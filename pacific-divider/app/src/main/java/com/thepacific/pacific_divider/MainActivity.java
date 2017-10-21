package com.thepacific.paficif_divider;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.thepacific.divider.RecyclerViewDivider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = new RecyclerView(this);
        recyclerView.addItemDecoration(RecyclerViewDivider.builder(this)
                .leftMargin(R.dimen.divider)
                .rightMargin(R.dimen.divider)
                .topMargin(R.dimen.divider)
                .bottomMargin(R.dimen.divider)
                .leftMarginFactory(new RecyclerViewDivider.MarginFactory() {
                    @Override
                    public int getMargin(int position) {
                        return 0;
                    }
                })
                .rightMarginFactory(new RecyclerViewDivider.MarginFactory() {
                    @Override
                    public int getMargin(int position) {
                        return 0;
                    }
                })
                .topMarginFactory(new RecyclerViewDivider.MarginFactory() {
                    @Override
                    public int getMargin(int position) {
                        return 0;
                    }
                })
                .bottomMarginFactory(new RecyclerViewDivider.MarginFactory() {
                    @Override
                    public int getMargin(int position) {
                        return 0;
                    }
                })
                .color(R.color.divider, R.dimen.divider_stroke_width)
                .drawable(R.drawable.divider)
                .drawableFactory(new RecyclerViewDivider.DrawableFactory() {
                    @Override
                    public Drawable getDrawable(int position) {

                        return null;
                    }

                    @Override
                    public int getStrokeWidth(int position) {
                        return 0;
                    }
                })
                .displayFilter(new RecyclerViewDivider.DisplayFilter() {
                    @Override
                    public boolean isDisplay(int position) {
                        return false;
                    }
                })
                .hideLastDivider()
                .build());

    }
}
