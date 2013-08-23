package com.droidplanner.helpers.srtm;

import android.os.AsyncTask;
import android.util.Log;

import com.droidplanner.file.DirectoryPath;

public class SrtmCache extends AsyncTask<Integer, Integer, Integer> {

	@Override
	protected Integer doInBackground(Integer... params) {
		Srtm Srtm = new Srtm(DirectoryPath.getDroidPlannerPath() + "/SRTM/");

		int alt = 0, sea = 0, high = 0;

		Log.d("SRTM", "fetching data");
		for (int i = 0; i < 1000; i++) {
			alt = Srtm.getData(-51.1439127, -29.7026708); // Near my house
			sea = Srtm.getData(-50.0360209, -29.8055343); // Sea level
			high = Srtm.getData(-50.0360209, -20.8055343); // High place
		}
		Log.d("SRTM", "Altitude:" + alt + " Sea:" + sea + " High:" + high);

		return null;
	}

}
