# Divider

Android library providing a simple way to control divider items of RecyclerView.

It only works for LinearLayoutManager.[ ![Download](https://api.bintray.com/packages/thepacific/maven/divider/images/download.svg) ](https://bintray.com/thepacific/maven/divider/_latestVersion)

# Usage

``` java
        recyclerView.addItemDecoration(RecyclerViewDivider.builder(this)
                .leftMargin(R.dimen.default_divider)
                .rightMargin(R.dimen.default_divider)
                .topMargin(R.dimen.default_divider)
                .bottomMargin(R.dimen.default_divider)
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
                .color(R.color.color_divider, R.dimen.default_color_divider_stroke_width)
                .drawable(R.drawable.drawable_divider)
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

```
