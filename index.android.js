'use strict';
import React from 'react';
import { NativeModules } from 'react-native';
var NativeLocationSettings = NativeModules.RNLocationSettings;

var LocationSettings = {
  openLocation: NativeLocationSettings.openLocation,
  openData: NativeLocationSettings.openData
};

export default LocationSettings;
