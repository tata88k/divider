# Divider

Android library providing a simple way to control divider items of RecyclerView.

[ ![Download](https://api.bintray.com/packages/thepacific/maven/divider/images/download.svg) ](https://bintray.com/thepacific/maven/divider/_latestVersion)

# Setup
```groovy
compile 'com.github.thepacific:divider:{lastestVersion}'
```

# Usage

``` java
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
                .displayFilter(new RecyclerViewDivider.DisplayFilter() {
                    @Override
                    public boolean isDisplay(int position) {
                        return false;
                    }
                })
                .hideLastDivider()
                .build());

```

# DrawableFactory

When you are using a DrawableFactory, please be aware of this

``` java
        new RecyclerViewDivider.DrawableFactory() {
            @Override
            public Drawable getDrawable(int position) {
                /**
                 * When using ColorDrawable, don't forget to override {@link getStrokeWidth()}.
                 * Because ColorDrawable.getIntrinsicWidth() always returns -1.
                 * So we need {@link getStrokeWidth()} to provider ColorDrawable's size
                 * For example:
                 *
                 * <pre><code>
                 *   new ColorDrawable(ContextCompat.getColor(MainActivity.this, R.color.divider));
                 * </code></pre>
                 *
                 * or
                 *
                 * <pre><code>
                 *   <drawable name="divider">#303F9F</drawable>
                 * </code></pre>
                 */
                return null;
            }

            @Override
            public int getStrokeWidth(int position) {
                /**
                 * No need to override, when using XML Drawable resource.
                 * Because in this case Drawable.getIntrinsicWidth() always returns it's size.
                 * So {@link getStrokeWidth()} is useless.
                 * For example:
                 *
                 * divider.xml drawable
                 *
                 * <pre><code>
                 *   <?xml version="1.0" encoding="utf-8"?>
                 *       <shape xmlns:android="http://schemas.android.com/apk/res/android"
                 *           android:shape="rectangle">
                 *           <size android:height="1dp" android:width="1dp"></size>
                 *           <solid android:color="@color/divider"></solid>
                 *       </shape>
                 * </code></pre>
                 */
                return 0;
            }
        };
```

or

``` java
      RecyclerViewDivider.builder(this)
          ......
          .build()
          .addTo(recyclerView);
```

# License 

[The MIT License ](https://opensource.org/licenses/MIT)

