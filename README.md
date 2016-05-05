# android-bottom-navigation
This is just a simple, lightweight and title less bottom menu navigation for android. Example project is provided.

![Example GIF](http://kmdev.se/android-bottom-navigation/example.gif)

Add it to your layout xml file:

```
<se.kmdev.bottomnavigation.BottomMenu
        android:id="@+id/bottom_menu"
        android:layout_width="match_parent"
        android:layout_height="@dimen/bottom_bar_height"
        android:background="@color/bottom_bar_bg"
        android:layout_alignParentBottom="true"/>
```

Add menu items via code:

```
        BottomMenu bottomMenu = (BottomMenu) findViewById(R.id.bottom_menu);

        ArrayList<BottomMenu.BottomMenuItem> items = new ArrayList<>();
        BottomMenu.BottomMenuItem first = new BottomMenu.BottomMenuItem(R.id.bottom_bar_first, R.drawable.ic_account_balance_black_24dp, R.color.bottom_bar_unselected, R.color.bottom_bar_selected);
        
        BottomMenu.BottomMenuItem second = new BottomMenu.BottomMenuItem(R.id.bottom_bar_second, R.drawable.ic_face_black_24dp, R.color.bottom_bar_unselected, R.color.bottom_bar_selected);

        items.add(first);
        items.add(second);

        bottomMenu.addItems(items);
```

Add a items selected listener:
```
bottomMenu.setBottomMenuClickListener(new BottomMenu.BottomMenuClickListener() {
            @Override
            public void onItemSelected(int position, int id, boolean triggeredOnRotation) {
                // Do something when item is selected
            }

            @Override
            public void onItemReSelected(int position, int id) {
                // Do something when item is re-selected
            }
        });
```

There you go!
