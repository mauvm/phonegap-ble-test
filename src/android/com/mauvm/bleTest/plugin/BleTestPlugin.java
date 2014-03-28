package com.mauvm.bleTest.plugin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import org.apache.cordova.*;
import org.apache.cordova.api.*;  // for Cordova 2.9
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BleTestPlugin extends CordovaPlugin {

	private Context context;

	@Override
	public void initialize( CordovaInterface cordova, CordovaWebView webView ) {
		super.initialize( cordova, webView );

		this.context = cordova.getActivity().getApplicationContext();
	}

	public boolean execute( String action, JSONArray data, CallbackContext callbackContext ) throws JSONException {

		if( action.equals( "test" ) ) {

			if( this.context.getPackageManager().hasSystemFeature( PackageManager.FEATURE_BLUETOOTH_LE ) ) {
				callbackContext.success();
			} else {
				callbackContext.error( "BLE not supported." );
			}

			return true;
		}

		return false;

	}

}
