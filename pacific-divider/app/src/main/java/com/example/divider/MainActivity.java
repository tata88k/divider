package com.example.divider;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.pacific.divider.RecyclerViewDivider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = new RecyclerView(this);
        recyclerView.addItemDecoration(RecyclerViewDivider.builder(this)
                .leftMargin(R.dimen.divider_left)
                .rightMargin(R.dimen.divider_right)
                .topMargin(R.dimen.divider_top)
                .bottomMargin(R.dimen.divider_bottom)
                .leftMarginFactory(new RecyclerViewDivider.MarginFactory() {
                    @Override
                    public int getMargin(int position) {
                        return getResources().getDimensionPixelSize(R.dimen.divider_left);
                    }
                })
                .rightMarginFactory(new RecyclerViewDivider.MarginFactory() {
                    @Override
                    public int getMargin(int position) {
                        return getResources().getDimensionPixelSize(R.dimen.divider_right);
                    }
                })
                .topMarginFactory(new RecyclerViewDivider.MarginFactory() {
                    @Override
                    public int getMargin(int position) {
                        return getResources().getDimensionPixelSize(R.dimen.divider_top);
                    }
                })
                .bottomMarginFactory(new RecyclerViewDivider.MarginFactory() {
                    @Override
                    public int getMargin(int position) {
                        return getResources().getDimensionPixelSize(R.dimen.divider_bottom);
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
                .visibility(new RecyclerViewDivider.Visibility() {
                    @Override
                    public boolean isVisible(int position) {
                        return false;
                    }
                })
                .hideLastDecoration()
                .build());

    }
}
