package ru.applct.trforallfree;



import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

public class Ders2 extends Fragment {
	private SlidingTabLayout mSlidingTabLayout;
	int tmp=0,tmp1=0;
	private ViewPager mViewPager;
	MediaPlayer ourMusic;
	public ImageButton play;
	public Ders2() {
		
	}
	public void onPause() {
        super.onPause();
        if(ourMusic != null){
        ourMusic.pause();
        tmp=0;  
        }
      }
	
	OnCompletionListener gListener = new OnCompletionListener() {
	    @Override
	    public void onCompletion(MediaPlayer ourMusic) {
	    	
	    	ourMusic.release();
	    	
	    	tmp=0;
	    	 
	    }

	};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.screen_first, container, false);

		return rootView;
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		// Get the ViewPager and set it's PagerAdapter so that it can display items
		mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
		mViewPager.setAdapter(new SamplePagerAdapter());

		// Give the SlidingTabLayout the ViewPager, this must be 
		// done AFTER the ViewPager has had it's PagerAdapter set.
		mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tabs);
		mSlidingTabLayout.setViewPager(mViewPager);
	}

	// Adapter
    class SamplePagerAdapter extends PagerAdapter {

        /**
         * Return the number of pages to display
         */
        @Override
        public int getCount() {
            return 3;
        }

		/**
		 * Return true if the value returned from is the same object as the View
		 * added to the ViewPager.
		 */
        @Override
        public boolean isViewFromObject(View view, Object o) {
            return o == view;
        }

		/**
		 * Return the title of the item at position. This is important as what
		 * this method returns is what is displayed in the SlidingTabLayout.
		 */
        @Override
        public CharSequence getPageTitle(int position) {
        	if(position==0){
       		 return "Аудирование";
       		
       	}
       	if(position==1){
      		 return "Грамматика";
      		
      	}
       	
       	return "Практика";
       }
       
		/**
		 * Instantiate the View which should be displayed at position. Here we
		 * inflate a layout from the apps resources and then change the text
		 * view to signify the position.
		 */
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
        	View view = getActivity().getLayoutInflater().inflate(R.layout.view,
                    container, false);
        	
        	WebView myWebView = (WebView) view.findViewById(R.id.webview);
        	
            
        	if(position==0){
        		View nview = getActivity().getLayoutInflater().inflate(R.layout.view1,
                        container, false);
        		WebView WebView = (WebView) nview.findViewById(R.id.webview);
        		ourMusic = MediaPlayer.create(getActivity(), R.raw.ders2dialg);
        		play = (ImageButton) nview.findViewById(R.id.imageButton1);
            	play.getBackground().setAlpha(5);
                   	play.setOnClickListener(new View.OnClickListener() {
          	            public void onClick(View v) {
          	            	 
          	            	 if (ourMusic == null) {
          	                     
          	            		 ourMusic.setOnCompletionListener(gListener);
          	                 }

          	                 if(tmp==1){
          	                	 ourMusic.pause();
          	                	play.setImageResource(R.drawable.play);
          	                 tmp=0;    
          	                 }
          	                 else{
          	                	 ourMusic.start();
          	                	play.setImageResource(R.drawable.pausen);
          	                	tmp=1;
          	                	 }
          	                    	       	                     
          	                 }
          	            		       	            	
          	            });
            // Add the newly created View to the ViewPager
        	
        	
            WebView.loadUrl("file:///android_asset/ders2dialg.html");
            container.addView(nview);
           
           
            // Return the View
            return nview;
        	}
        	
        	
        	
        	if(position==1){
        		
        		// Add the newly created View to the ViewPager
            	myWebView.loadUrl("file:///android_asset/ders2grm.html");
                container.addView(view);
        		
        		
        		
        		
                return view;
            	}
        	if(position==2){
            	
        		 // Add the newly created View to the ViewPager
        		View viewtest = getActivity().getLayoutInflater().inflate(R.layout.test,
                        container, false);
                // Add the newly created View to the ViewPager
        		
        		final Button button1 = (Button) viewtest.findViewById(R.id.button1);
        		final Button button2 = (Button) viewtest.findViewById(R.id.button2);
        		final Button button3 = (Button) viewtest.findViewById(R.id.button3);
        		final Button button4 = (Button) viewtest.findViewById(R.id.button4);
        		final Button button5 = (Button) viewtest.findViewById(R.id.button6);
        		 button1.getBackground().setAlpha(15);
        		 button2.getBackground().setAlpha(15);
        		 button3.getBackground().setAlpha(15);
        		 button4.getBackground().setAlpha(15);
        		 button5.getBackground().setAlpha(15);
        		 
        		button1.setOnClickListener(new View.OnClickListener() {
    	            public void onClick(View v) {
    	            	
    	            	Intent intent = new Intent(getActivity(), Ders2slov.class);
    	                ((MainActivity) getActivity()).startActivity(intent);	
    	            	
    	            	
    	            }
    	        });
        		
        		button2.setOnClickListener(new View.OnClickListener() {
    	            public void onClick(View v) {
    	            	Intent intent = new Intent(getActivity(), Ders2pari.class);
    	                ((MainActivity) getActivity()).startActivity(intent);	
    	            	
    	            	
    	            }
    	        });
        		button3.setOnClickListener(new View.OnClickListener() {
    	            public void onClick(View v) {
    	            	

    	            	Intent intent = new Intent(getActivity(), Ders2dialg.class);
    	                ((MainActivity) getActivity()).startActivity(intent);	
    	            	
    	            	
    	            }
    	        });
        		button4.setOnClickListener(new View.OnClickListener() {
    	            public void onClick(View v) {
    	            	

    	            	Intent intent = new Intent(getActivity(), Ders2konstr.class);
    	                ((MainActivity) getActivity()).startActivity(intent);	
    	            	
    	            	
    	            }
    	        });
        		button5.setOnClickListener(new View.OnClickListener() {
    	            public void onClick(View v) {
    	            	

    	            	Intent intent = new Intent(getActivity(), Ders2grm.class);
    	                ((MainActivity) getActivity()).startActivity(intent);	
    	            	
    	            	
    	            }
    	        });

                
                container.addView(viewtest);
                // Return the View
                
                return viewtest;
 
                

                           	}
        	
        	
			return view;
        }

		/**
		 * Destroy the item from the ViewPager. In our case this is simply
		 * removing the View.
		 */
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
            if(ourMusic != null){
            	ourMusic.stop();
            	tmp=0;
            	play.setImageResource(R.drawable.play);
            	}
            	ourMusic = MediaPlayer.create(getActivity(), R.raw.ders2dialg);

            	 play.setOnClickListener(new View.OnClickListener() {
        	            public void onClick(View v) {
        	            	 
        	            	 if (ourMusic == null) {
        	                     
        	            		 ourMusic.setOnCompletionListener(gListener);
        	                 }

        	                 if(tmp==1){
        	                	 ourMusic.pause();
        	                	 play.setImageResource(R.drawable.play);
        	                 tmp=0;    
        	                 }
        	                 else{
        	                	 ourMusic.start();
        	                	 play.setImageResource(R.drawable.pausen);
        	                	tmp=1;
        	                	 }
        	                    	       	                     
        	                 }
        	            		       	            	
        	            });
            
        }
    }	
}