package com.example.thenewboston;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {
		MediaPlayer ourSong;
	@Override
	protected void onCreate(Bundle TravisLoveBacon) {
		// TODO Auto-generated method stub
		super.onCreate(TravisLoveBacon);
		setContentView(R.layout.splash);
		ourSong = MediaPlayer.create(Splash.this, R.raw.music);
		ourSong.start();
		Thread timer = new Thread() {
			@Override
			public void run() {
				try {
					sleep(10000);

				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent openMainActivity = new Intent(
							"com.example.thenewboston.Menu");
					startActivity(openMainActivity);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}
	

}
