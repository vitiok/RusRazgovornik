package ru.applct.trforallfree;


import android.app.ActionBar;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

	private String[] mScreenTitles;
	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	MediaPlayer ourMusic,newMusic;
    private ActionBarDrawerToggle mDrawerToggle;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#90CAF9")));
		mTitle = mDrawerTitle = getTitle();
		mScreenTitles = getResources().getStringArray(R.array.screen_array);
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerList = (ListView) findViewById(R.id.left_drawer);

		// Set the adapter for the list view
		mDrawerList.setAdapter(new ArrayAdapter<String>(this,
				R.layout.drawer_list_item, mScreenTitles));
		// Set the list's click listener
		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
		
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		
		mDrawerToggle = new ActionBarDrawerToggle(
				this, /* host Activity */
				mDrawerLayout, /* DrawerLayout object */
				R.drawable.ic_drawer, /* nav drawer icon to replace 'Up' caret */
				R.string.drawer_open, /* "open drawer" description */
				R.string.drawer_close /* "close drawer" description */
				) {

			/** Called when a drawer has settled in a completely closed state. */
			public void onDrawerClosed(View view) {
				getSupportActionBar().setTitle(mTitle);
				supportInvalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
			}

			/** Called when a drawer has settled in a completely open state. */
			public void onDrawerOpened(View drawerView) {
				getSupportActionBar().setTitle(mDrawerTitle);
            	supportInvalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
			}
		};

		// Set the drawer toggle as the DrawerListener
		mDrawerLayout.setDrawerListener(mDrawerToggle);
		
		// Initialize the first fragment when the application first loads.
		if (savedInstanceState == null) {
			
			selectItem(0);
		}

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
		
	
		  public boolean onOptionsItemSelected(MenuItem item){
			  if (mDrawerToggle.onOptionsItemSelected(item)) {
					return true;
				} 
			  switch(item.getItemId()){
		        
 case R.id.share_menu:
			        
		        	Intent sharingIntent = new Intent(Intent.ACTION_SEND);
		        	sharingIntent.setType("text/plain");
		        	sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=ru.applct.trforallfree");
		        	sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject");

		        	startActivity(Intent.createChooser(sharingIntent, getString(R.string.app_link)));
		        break;
		        case R.id.rate_menu:
		        	startActivity( new Intent( Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=ru.applct.trforallfree") ) );
				    
		        
		        break;
		        case R.id.pause:
		       
		        	Intent f = new Intent();
					 f.setClass(getApplicationContext(),About.class);
					 startActivity(f);
		        	
		                	       	
		           break;
		        case R.id.action_settings:
		               
		        	Intent i = new Intent();
					 i.setClass(getApplicationContext(),Support.class);
					 startActivity(i);
		             break;
		             
		        
		        }
		        	
		       
		       
		  
		   
		return true;
	}



	
	 /* The click listener for ListView in the navigation drawer */
	private class DrawerItemClickListener implements ListView.OnItemClickListener {
	    @Override
	    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	        selectItem(position);
	    }
	}

	/** Swaps fragments in the main content view */
	private void selectItem(int position) {
        // Update the main content by replacing fragments
        Fragment fragment = null;
        switch (position) {
        
        case 0:
            fragment = new ScreenOne();
            break;
        case 1:
            fragment = new ScreenTwo();
            break;
        case 2:
        	fragment = new ScreenThree();
            break;
        case 3:
        	fragment = new Ders2();
            break;
        case 4:
        	fragment = new Ders3();
            break;
        case 5:
        	fragment = new Ders4();
            break;
        case 6:
        	fragment = new Ders5();
            break;
        case 7:
        	fragment = new Ders6();
            break;
        case 8:
        	fragment = new Ders10();
            break;
        case 9:
        	fragment = new Ders10();
            break;
        case 10:
        	fragment = new Ders10();
            break;
        case 11:
        	fragment = new Ders10();
            break;
        case 12:
        	fragment = new Ders10();
            break;
        case 13:
        	fragment = new Ders10();
            break;
        case 14:
        	fragment = new Ders10();
            break;
        case 15:
        	fragment = new Ders10();
            break;
        case 16:
        	fragment = new Ders10();
            break;
        case 17:
        	fragment = new Glagoli();
            break;
        default:
            break;
        }
 
        // Insert the fragment by replacing any existing fragment
        if (fragment != null) {
        	FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, fragment).commit();
 
            // Highlight the selected item, update the title, and close the drawer
    	    mDrawerList.setItemChecked(position, true);
    	    setTitle(mScreenTitles[position]);
    	    mDrawerLayout.closeDrawer(mDrawerList);
        } else {
            // Error
            Log.e(this.getClass().getName(), "Error. Fragment is not created");
        }
    }
	
	@Override
	public void setTitle(CharSequence title) {
	    mTitle = title;
	    getSupportActionBar().setTitle(mTitle);
	}
	
	/**
     * When using the ActionBarDrawerToggle, you must call it during
     * onPostCreate() and onConfigurationChanged()...
     */
	
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Pass any configuration change to the drawer toggles
		mDrawerToggle.onConfigurationChanged(newConfig);
	}
	
}