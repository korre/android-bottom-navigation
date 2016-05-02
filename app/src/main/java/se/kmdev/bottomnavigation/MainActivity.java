package se.kmdev.bottomnavigation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private BottomMenu mBottomMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomMenu = (BottomMenu) findViewById(R.id.bottom_menu);
        setupBottomMenuTabs();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setupBottomMenuClickListener();
    }

    /**
     * This needs to be done in onResume() so it work properly with lifecycle methods and savedInstanceState etc.
     */
    private void setupBottomMenuTabs() {
        ArrayList<BottomMenu.BottomMenuItem> items = new ArrayList<>();
        BottomMenu.BottomMenuItem news = new BottomMenu.BottomMenuItem(R.id.bottom_bar_first, R.drawable.ic_account_balance_black_24dp, R.color.bottom_bar_unselected, R.color.bottom_bar_selected);
        BottomMenu.BottomMenuItem tw = new BottomMenu.BottomMenuItem(R.id.bottom_bar_second, R.drawable.ic_face_black_24dp, R.color.bottom_bar_unselected, R.color.bottom_bar_selected);
        BottomMenu.BottomMenuItem listing = new BottomMenu.BottomMenuItem(R.id.bottom_bar_third, R.drawable.ic_subscriptions_black_24dp, R.color.bottom_bar_unselected, R.color.bottom_bar_selected);
        BottomMenu.BottomMenuItem tv = new BottomMenu.BottomMenuItem(R.id.bottom_bar_forth, R.drawable.ic_whatshot_black_24dp, R.color.bottom_bar_unselected, R.color.bottom_bar_selected);

        items.add(news);
        items.add(tw);
        items.add(listing);
        items.add(tv);

        mBottomMenu.addItems(items);
    }

    private void setupBottomMenuClickListener() {
        mBottomMenu.setBottomMenuClickListener(new BottomMenu.BottomMenuClickListener() {
            @Override
            public void onItemSelected(int position, int id, boolean triggeredOnRotation) {
                // Do something when item is selected
            }

            @Override
            public void onItemReSelected(int position, int id) {
                // Do something when item is re-selected
            }
        });
    }
}
