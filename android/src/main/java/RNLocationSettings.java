package co.fixt.react.location.settings;

import android.content.Context;
import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


public final class RNLocationSettings extends ReactContextBaseJavaModule {
  private ReactApplicationContext mContext;
  private static final String TAG = "RNLocationSettings";

  public RNLocationSettings(ReactApplicationContext reactContext) {
    super(reactContext);
    mContext = reactContext;
  }

  @Override
  public String getName() {
    return TAG;
  }

  @ReactMethod
  public void openLocation() {
    Intent viewIntent = new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
    viewIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    mContext.startActivity(viewIntent);
  }

  @ReactMethod
  public void openData() {
    Intent viewIntent = new Intent(android.provider.Settings.ACTION_DATA_ROAMING_SETTINGS);
    viewIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    mContext.startActivity(viewIntent);
  }
}
