package com.mauvm.bleTest.plugin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BleTestPlugin extends CordovaPlugin {

	@Override
	public boolean execute( String action, JSONArray data, CallbackContext callbackContext ) throws JSONException {

		return getPackageManager().hasSystemFeature( PackageManager.FEATURE_BLUETOOTH_LE );

	}

}
